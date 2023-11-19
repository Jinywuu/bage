package com.bage.finance.biz.service.impl;

import com.bage.common.exception.BizException;
import com.bage.common.exception.ParameterException;
import com.bage.finance.biz.constant.RedisKeyConstant;
import com.bage.finance.biz.domain.MemberBindPhone;
import com.bage.finance.biz.dto.form.PhoneRegisterForm;
import com.bage.finance.biz.enums.SmsCodeTypeEnum;
import com.bage.finance.biz.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.context.event.EventListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.Objects;
import java.util.concurrent.TimeUnit;


@Service
@Slf4j
@RequiredArgsConstructor
public class MemberRegServiceImpl implements MemberRegService {
    final MemberLoginService memberLoginService;
    final RedissonClient redissonClient;
    final MemberBindPhoneService memberBindPhoneService;
    final TransactionTemplate transactionTemplate;
    final TenantService tenantService;
    final MemberService memberService;

    /**
     * 注册 保存到数据库
     *
     * @param request
     * @return
     */
    @Override
    public long phoneReg(PhoneRegisterForm request) {
        if (!Objects.equals(request.getPassword(), request.getConfirmPassword())) {
            throw new ParameterException("两次输入的密码不一致");
        }
        memberLoginService.checkSmsCode(request.getPhone(), request.getSmsCode(), SmsCodeTypeEnum.REG.getCode());

        RLock rLock = redissonClient.getLock("PHONE_REG:" + request.getPhone());
        try {
            rLock.lock();
            MemberBindPhone memberBindPhone = memberBindPhoneService.getMemberByPhone(request.getPhone());
            if (memberBindPhone != null) {
                log.warn("手机号：{}已注册", request.getPhone());
                throw new BizException("手机号已注册");
            }
            //将游客数据入口（保证数据一致性）
            Long memberId = transactionTemplate.execute(transactionStatus -> {
                long tenantId = tenantService.add();
                long id = memberService.reg(tenantId);
                if (id <= 0) {
                    throw new BizException("注册异常");
                }
                memberBindPhoneService.reg(request.getPhone(), id, request.getPassword());
                return id;
            });
            if (memberId == null) {
                throw new BizException("注册失败");
            }
            return memberId;
        } catch (Exception ex) {
            throw new BizException("注册失败", ex);
        } finally {
            rLock.unlock();
        }
    }
}
