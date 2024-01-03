package com.bage.finance.biz.service.impl;

import com.bage.common.constant.CommonConstant;
import com.bage.common.dto.PageHelperRequest;
import com.bage.common.exception.BizException;
import com.bage.common.service.TokenService;
import com.bage.common.util.DateUtil;
import com.bage.finance.biz.config.ObjectConvertor;
import com.bage.finance.biz.domain.SysMenu;
import com.bage.finance.biz.domain.SysResource;
import com.bage.finance.biz.domain.SysRole;
import com.bage.finance.biz.dto.AdminDTO;
import com.bage.finance.biz.dto.form.CreateSysRoleForm;
import com.bage.finance.biz.dto.form.ListRoleForm;
import com.bage.finance.biz.dto.form.UpdateRoleDisableForm;
import com.bage.finance.biz.dto.form.UpdateRoleForm;
import com.bage.finance.biz.dto.vo.GetRoleDetailVo;
import com.bage.finance.biz.dto.vo.ListRoleVo;
import com.bage.finance.biz.mapper.SysRoleMapper;
import com.bage.finance.biz.service.MemberService;
import com.bage.finance.biz.service.SysMenuService;
import com.bage.finance.biz.service.SysResourceService;
import com.bage.finance.biz.service.SysRoleService;
import com.bage.mybatis.help.Criteria;
import com.bage.mybatis.help.MyBatisWrapper;
import com.bage.mybatis.help.PageInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

import static com.bage.finance.biz.domain.SysRoleField.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class SysRoleServiceImpl implements SysRoleService {
    final SysRoleMapper sysRoleMapper;
    final ObjectConvertor objectConvertor;
    final TokenService<AdminDTO> tokenService;
    final ObjectMapper jsonMapper;
    final RedisTemplate<String, Object> redisTemplate;
    final SysMenuService sysMenuService;
    final MemberService memberService;
    final SysResourceService sysResourceService;

    /**
     * 保存角色路由
     *
     * @param form
     * @return
     */
    @Override
    public boolean create(CreateSysRoleForm form) {
        SysRole sysRole = new SysRole();
        sysRole.initDefault();
        sysRole.setMemberId(tokenService.getThreadLocalUserId());
        sysRole.setUpdateMemberId(sysRole.getMemberId());
        sysRole.setRoleName(form.getRoleName());
        sysRole.setDisable(form.getDisable());

        boolean result = sysRoleMapper.insert(sysRole) > 0;
        if (!result) {
            throw new BizException("保存角色路由失败");
        }
        return true;
    }

    /**
     * 查看角色列表
     *
     * @param form
     * @return
     */
    @Override
    public PageInfo<ListRoleVo> list(ListRoleForm form) {
        MyBatisWrapper<SysRole> myBatisWrapper = new MyBatisWrapper<>();
        myBatisWrapper.select(Id, RoleName, Disable)
                .page(form.getPageNum(), form.getPageSize());
        Criteria where = myBatisWrapper.whereBuilder()
                .andEq(setDelFlag(false));
        if (Strings.isNotBlank(form.getRoleName())) {
            where.andLike(RoleName, "%" + form.getRoleName() + "%");
        }
        if (form.getDisable() != null) {
            where.andEq(setDisable(form.getDisable()));
        }
        myBatisWrapper.orderByDesc(CreateTime);
        PageInfo<SysRole> sysRolePageInfo = myBatisWrapper.listPage(sysRoleMapper);
        return objectConvertor.toListRoleVoPage(sysRolePageInfo);
    }

    /**
     * 查看角色列表
     *
     * @param form
     * @return
     */
    @Override
    public List<SysRole> list(PageHelperRequest form) {
        MyBatisWrapper<SysRole> wrapper = new MyBatisWrapper<>();
        wrapper.select(Id, RoleName, Disable, DelFlag)
                .page(form.getPageNum(), form.getPageSize())
                .whereBuilder();

        wrapper.orderByDesc(CreateTime);
        return sysRoleMapper.list(wrapper);
    }

    /**
     * 删除角色
     *
     * @param id
     * @return
     */
    @Override
    public boolean del(int id) {
        MyBatisWrapper<SysRole> wrapper = new MyBatisWrapper<>();
        wrapper.update(setDelFlag(true))
                .update(setUpdateTime(DateUtil.getSystemTime()))
                .update(setUpdateMemberId(tokenService.getThreadLocalUserId()))
                .whereBuilder()
                .andEq(setId(id))
                .andEq(setDelFlag(false));
        if (sysRoleMapper.updateField(wrapper) == 0) {
            return false;
        }
        //删除会员角色id
        //todo 后续通过mq发送消息调用删除
        //memberService.delRoleIds(id);
        return true;
    }

    /**
     * 禁用角色
     *
     * @param form
     * @return
     */
    @Override
    public boolean updateDisable(UpdateRoleDisableForm form) throws JsonProcessingException {
        MyBatisWrapper<SysRole> wrapper = new MyBatisWrapper<>();
        wrapper.update(setDisable(form.getDisable()))
                .update(setUpdateTime(DateUtil.getSystemTime()))
                .update(setUpdateMemberId(tokenService.getThreadLocalUserId()))
                .whereBuilder()
                .andEq(setId(form.getId()))
                .andEq(setDelFlag(false))
                .andEq(setDisable(!form.getDisable()));
        return sysRoleMapper.updateField(wrapper) > 0;
    }

    /**
     * 修改角色
     *
     * @param form
     * @return
     */
    @Override
    public boolean update(UpdateRoleForm form) {
        MyBatisWrapper<SysRole> wrapper = new MyBatisWrapper<>();
        wrapper.update(setRoleName(form.getRoleName()))
                .whereBuilder()
                .andEq(setId(form.getId()))
                .andEq(setDelFlag(false));

        return sysRoleMapper.updateField(wrapper) > 0;
    }

    /**
     * 获取角色明细
     *
     * @param id
     * @return
     */
    @Override
    public GetRoleDetailVo getById(int id) {
        MyBatisWrapper<SysRole> wrapper = new MyBatisWrapper<>();
        wrapper.select(Id, RoleName)
                .whereBuilder()
                .andEq(setId(id))
                .andEq(setDelFlag(false));
        SysRole sysRole = sysRoleMapper.get(wrapper);
        return objectConvertor.toGetRoleDetailVo(sysRole);
    }
}
