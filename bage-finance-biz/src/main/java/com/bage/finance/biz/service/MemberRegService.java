package com.bage.finance.biz.service;


import com.bage.finance.biz.dto.form.PhoneRegisterForm;
import com.bage.finance.biz.dto.vo.GenerateMpRegCodeVo;

public interface MemberRegService {

    /**
     * 注册 保存到数据库
     *
     * @param form
     * @return
     */
    long phoneReg(PhoneRegisterForm form);

    /**
     * 生成微信公众号二维码 用于关注注册
     *
     * @return
     */
    GenerateMpRegCodeVo generateMpRegCode(String clientId);
}
