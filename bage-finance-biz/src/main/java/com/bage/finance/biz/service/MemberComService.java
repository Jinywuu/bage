package com.bage.finance.biz.service;

import com.bage.finance.biz.dto.vo.CurrentInfoVo;

public interface MemberComService {
    /**
     * 获取用户信息
     *
     * @return
     */
    CurrentInfoVo getCurrentInfo();
}