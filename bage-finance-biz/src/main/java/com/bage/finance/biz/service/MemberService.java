package com.bage.finance.biz.service;

public interface MemberService {
    /**
     * 注册
     * @param tenantId 租户id
     * @return 会员id
     */
    long reg(long tenantId);
}
