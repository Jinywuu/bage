package com.bage.finance.biz.service.impl;

import com.bage.finance.biz.domain.MemberBindPhone;
import com.bage.finance.biz.mapper.MemberBindPhoneMapper;
import com.bage.finance.biz.service.MemberBindPhoneService;
import com.bage.mybatis.help.MyBatisWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static com.bage.finance.biz.domain.MemberBindPhoneField.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberBindPhoneServiceImpl implements MemberBindPhoneService {
    final MemberBindPhoneMapper memberBindPhoneMapper;
    /**
     * 根据手机号获取用户信息
     *
     * @param phone
     * @return
     */
    @Override
    public MemberBindPhone getMemberByPhone(String phone) {
        MyBatisWrapper<MemberBindPhone> myBatisWrapper = new MyBatisWrapper<>();
        myBatisWrapper.select(MemberId, Phone, Password)
                .whereBuilder().andEq(setPhone(phone));
        // select member_id,phone,password from member_bind_phone where phone = ?
        return memberBindPhoneMapper.topOne(myBatisWrapper);
    }
}
