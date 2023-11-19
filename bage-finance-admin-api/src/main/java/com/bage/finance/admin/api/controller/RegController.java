package com.bage.finance.admin.api.controller;

import com.bage.common.dto.ApiResponse;
import com.bage.finance.biz.dto.form.PhoneRegisterForm;
import com.bage.finance.biz.service.MemberRegService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户模块")
@RestController
@RequestMapping(value = "/reg")
@RequiredArgsConstructor
@Slf4j
public class RegController {
    final MemberRegService memberRegService;

    @ApiOperation(value = "手机号注册")
    @PostMapping(value = "/phoneReg")
    public ApiResponse<Long> phoneReg(@Validated @RequestBody PhoneRegisterForm form) {
        return ApiResponse.success(memberRegService.phoneReg(form));
    }
}
