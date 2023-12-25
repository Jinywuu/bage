package com.bage.finance.biz.service.impl;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import com.bage.common.exception.BizException;
import com.bage.common.service.TokenService;
import com.bage.finance.biz.config.ObjectConvertor;
import com.bage.finance.biz.domain.Member;
import com.bage.finance.biz.dto.AdminDTO;
import com.bage.finance.biz.dto.vo.CurrentInfoVo;
import com.bage.finance.biz.service.MemberComService;
import com.bage.finance.biz.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


@Service
@Slf4j
@RequiredArgsConstructor
public class MemberComServiceImpl implements MemberComService {
    final MemberService memberService;
    final ObjectConvertor objectConvertor;
    final TokenService<AdminDTO> tokenService;


    /**
     * 获取用户信息
     *
     * @return
     */
    @Override
    public CurrentInfoVo getCurrentInfo() {
        Member member = memberService.get(tokenService.getThreadLocalUserId());
        if (Objects.isNull(member)) {
            throw new BizException("用户不存在");
        }
        if (member.getDisable()) {
            throw new BizException("用户被禁用");
        }
        return objectConvertor.toCurrentInfoVo(member);
    }
}
