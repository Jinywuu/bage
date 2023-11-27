package com.bage.finance.biz.config;

import com.bage.finance.biz.dto.vo.GenerateMpRegCodeVo;
import com.bage.wx.dto.MpQrCodeCreateResult;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ObjectConvertor {
    GenerateMpRegCodeVo toGenerateMpRegCodeResponse(MpQrCodeCreateResult source);
}