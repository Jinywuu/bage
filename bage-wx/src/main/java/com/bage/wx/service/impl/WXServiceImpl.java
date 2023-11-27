package com.bage.wx.service.impl;

import com.bage.wx.constant.WXApiConstant;
import com.bage.wx.dto.AccessTokenResult;
import com.bage.wx.dto.MpQrCodeCreateRequest;
import com.bage.wx.dto.MpQrCodeCreateResult;
import com.bage.wx.service.WXService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
@RequiredArgsConstructor
public class WXServiceImpl implements WXService {
    //    final RestTemplate restTemplate;
    final WebClient webClient;
    //接口重试次数
    int retry = 3;

    /**
     * 获取微信公众号token
     * 参考接口文档：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/access-token/auth.getAccessToken.html
     *
     * @param appid
     * @param secret
     * @return
     */
    @Override
    public AccessTokenResult getMpAccessToken(String appid, String secret) {
        String url = String.format(WXApiConstant.ACCESS_TOKEN_API, appid, secret);
        return webClient.get().uri(url).retrieve().bodyToMono(AccessTokenResult.class)
                .retry(retry)
                .block();
    }

    /**
     * 生成临时公众号二维码
     * 文档地址：https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=TOKEN
     *
     * @param token
     * @param request
     * @return
     */
    @Override
    public MpQrCodeCreateResult createMpQrcodeCreate(String token, MpQrCodeCreateRequest request) {
        String url = String.format(WXApiConstant.MP_QRCODE_CREATE, token);
        MpQrCodeCreateResult result = webClient.post().uri(url).contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve().bodyToMono(MpQrCodeCreateResult.class).retry(retry)
                .block();
        if (result == null || Strings.isBlank(result.getTicket())) {
            return result;
        }
        result.setQrCodeUrl("https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=" + result.getTicket());
        return result;
    }


}
