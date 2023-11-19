package com.bage.finance.biz.service;


import com.bage.finance.biz.dto.form.PhoneRegisterForm;

public interface MemberRegService {

    /**
     * 注册 保存到数据库
     *
     * @param form
     * @return
     */
    long phoneReg(PhoneRegisterForm form);
}
