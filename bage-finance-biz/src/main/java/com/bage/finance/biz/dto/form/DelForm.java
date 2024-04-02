package com.bage.finance.biz.dto.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class DelForm {

    /**
     * 科目id
     */
    @NotNull
    private Long id;
}