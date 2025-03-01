package com.bage.finance.admin.api.controller;

import com.bage.common.dto.ApiResponse;
import com.bage.finance.biz.dto.form.RoleBindMenuForm;
import com.bage.finance.biz.service.SysRoleBindMenuService;
import com.bage.finance.biz.service.SysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "系统角色绑定菜单")
@RestController
@RequestMapping(value = "/sysRoleBindMenu")
@RequiredArgsConstructor
@Slf4j
@Validated
public class SysRoleBindMenuController {
    final SysRoleBindMenuService sysRoleBindMenuService;

    @ApiOperation(value = "查询绑定的菜单列表")
    @GetMapping(value = "/listBindMenuIdByRoleId")
    public ApiResponse<List<Integer>> listBindMenuIdByRoleId(@RequestParam int roleId) {
        return ApiResponse.success(sysRoleBindMenuService.listBindMenuIdByRoleId(roleId));
    }
}
