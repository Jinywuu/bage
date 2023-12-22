package com.bage.finance.biz.domain;

import java.util.Date;

/**
 * 用户表绑定手机表（表：member_bind_phone）
 *
 * @author bage
 * @date 2023-12-22 10:04:28
 */
public class MemberBindPhone {
    /**
     * 
     */
    private Long id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户id
     */
    private Long memberId;

    /**
     * 是否禁用
     */
    private Boolean disable;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 密码
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_phone.id
     *
     * @return the value of member_bind_phone.id
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_phone.id
     *
     * @param id the value for member_bind_phone.id
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_phone.phone
     *
     * @return the value of member_bind_phone.phone
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_phone.phone
     *
     * @param phone the value for member_bind_phone.phone
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_phone.member_id
     *
     * @return the value of member_bind_phone.member_id
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_phone.member_id
     *
     * @param memberId the value for member_bind_phone.member_id
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_phone.disable
     *
     * @return the value of member_bind_phone.disable
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public Boolean getDisable() {
        return disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_phone.disable
     *
     * @param disable the value for member_bind_phone.disable
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_phone.create_time
     *
     * @return the value of member_bind_phone.create_time
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_phone.create_time
     *
     * @param createTime the value for member_bind_phone.create_time
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_phone.update_time
     *
     * @return the value of member_bind_phone.update_time
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_phone.update_time
     *
     * @param updateTime the value for member_bind_phone.update_time
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_phone.password
     *
     * @return the value of member_bind_phone.password
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_phone.password
     *
     * @param password the value for member_bind_phone.password
     *
     * @mbg.generated Fri Dec 22 10:04:29 CST 2023
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public void initDefault() {
        if (this.getPhone() == null) {
            this.setPhone("");
        }
        if (this.getMemberId() == null) {
            this.setMemberId(0L);
        }
        if (this.getDisable() == null) {
            this.setDisable(false);
        }
        if (this.getCreateTime() == null) {
            this.setCreateTime(new Date());
        }
        if (this.getUpdateTime() == null) {
            this.setUpdateTime(new Date());
        }
    }

    public void initUpdate() {
    }
}