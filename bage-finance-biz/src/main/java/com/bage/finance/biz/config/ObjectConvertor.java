package com.bage.finance.biz.config;

import com.bage.finance.biz.domain.*;
import com.bage.finance.biz.dto.form.AddAccountBookForm;
import com.bage.finance.biz.dto.form.CreateCurrencyConfigForm;
import com.bage.finance.biz.dto.form.CreateMenuForm;
import com.bage.finance.biz.dto.form.CreateSysResourceForm;
import com.bage.finance.biz.dto.vo.*;
import com.bage.mybatis.help.PageInfo;
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

    SysResource toSysResource(CreateSysResourceForm source);
    GetSysResourceVo toGetSysResourceVo(SysResource source);
    List<ListSysResourceVo> toListSysResourceVo(List<SysResource> source);

    PageInfo<ListRoleVo> toListRoleVoPage(PageInfo<SysRole> source);
    GetRoleDetailVo toGetRoleDetailVo(SysRole source);

    MenuDataItemVo toMenuDataItemVo(SysMenu source);

    List<MenuDataItemVo> toMenuDataItemVo(List<SysMenu> source);

    GetAccountBookVo toGetAccountBookVo(AccountBook source);
    PageInfo<ListAccountBookVo> toListAccountBookVoPage(PageInfo<AccountBook> source);
    AccountBook toAccountBook(AddAccountBookForm source);

    List<DataDictionaryVo> toDataDictionaryVo(List<DataDictionary> source);

    List<ListCurrencyConfigVo> toListCurrencyConfigVo(List<CurrencyConfig> source);

    CurrencyConfig toCurrencyConfig(CreateCurrencyConfigForm source);

    GetCurrencyConfigVo toGetCurrencyConfigVo(CurrencyConfig source);
}