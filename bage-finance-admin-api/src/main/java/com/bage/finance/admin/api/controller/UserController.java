package com.bage.finance.admin.api.controller;

import com.bage.common.dto.ApiResponse;
import com.bage.finance.biz.dto.vo.CurrentInfoVo;
import com.bage.finance.biz.service.MemberComService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户模块")
@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    final MemberComService memberComService;

    @ApiOperation(value = "获取当前登录用户信息")
    @GetMapping(value = "/currentUser")
    public ApiResponse<CurrentInfoVo> currentUser() {
        return ApiResponse.success(memberComService.getCurrentInfo());
    }
}
