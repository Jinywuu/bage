package com.bage.finance.biz.config;

import com.bage.finance.biz.domain.Member;
import com.bage.finance.biz.domain.SysMenu;
import com.bage.finance.biz.dto.form.CreateMenuForm;
import com.bage.finance.biz.dto.vo.*;
import com.bage.wx.dto.MpQrCodeCreateResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ObjectConvertor {
    GenerateMpRegCodeVo toGenerateMpRegCodeResponse(MpQrCodeCreateResult source);

    @Mappings({@Mapping(target = "avatar", source = "avatarUrl")})
    CurrentInfoVo toCurrentInfoVo(Member source);

    @Mappings({@Mapping(target = "key", source = "id"),
            @Mapping(target = "title", source = "name")})
    ListTreeMenuVo toListTreeMenuVo(SysMenu source);

    List<ListTreeMenuVo> toListTreeMenuVo(List<SysMenu> source);

    @Mappings({@Mapping(target = "value", source = "id"),
            @Mapping(target = "title", source = "name")})
    ListTreeSelectMenuVo toListTreeSelectMenuVo(SysMenu source);

    List<ListTreeSelectMenuVo> toListTreeSelectMenuVo(List<SysMenu> source);

    GetMenuByIdVo toGetMenuByIdVo(SysMenu source);

    SysMenu toSysMenu(CreateMenuForm source);
}