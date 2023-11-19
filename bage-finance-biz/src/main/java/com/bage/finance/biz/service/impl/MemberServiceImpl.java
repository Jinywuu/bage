package com.bage.finance.biz.service.impl;

import com.bage.finance.biz.domain.Member;
import com.bage.finance.biz.mapper.MemberMapper;
import com.bage.finance.biz.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    final MemberMapper memberMapper;

    /**
     * 注册
     *
     * @param tenantId 租户id
     * @return 会员id
     */
    @Override
    public long reg(long tenantId) {
        Member member = new Member();
        member.setTenantId(tenantId);
        member.initDefault();
        memberMapper.insert(member);
        return member.getId();
    }
}
