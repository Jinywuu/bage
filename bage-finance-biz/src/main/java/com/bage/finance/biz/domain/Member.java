package com.bage.finance.biz.domain;

import java.util.Date;

/**
 * 用户表（表：member）
 *
 * @author bage
 * @date 2024-01-16 11:01:36
 */
public class Member {
    /**
     * 
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String nickName;

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
     * 姓名
     */
    private String name;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 角色id，多个以英文逗号分隔
     */
    private String sysRoleIds;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.id
     *
     * @return the value of member.id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.id
     *
     * @param id the value for member.id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.nick_name
     *
     * @return the value of member.nick_name
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.nick_name
     *
     * @param nickName the value for member.nick_name
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.disable
     *
     * @return the value of member.disable
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Boolean getDisable() {
        return disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.disable
     *
     * @param disable the value for member.disable
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.create_time
     *
     * @return the value of member.create_time
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.create_time
     *
     * @param createTime the value for member.create_time
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.update_time
     *
     * @return the value of member.update_time
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.update_time
     *
     * @param updateTime the value for member.update_time
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.name
     *
     * @return the value of member.name
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.name
     *
     * @param name the value for member.name
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.avatar_url
     *
     * @return the value of member.avatar_url
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.avatar_url
     *
     * @param avatarUrl the value for member.avatar_url
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.tenant_id
     *
     * @return the value of member.tenant_id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.tenant_id
     *
     * @param tenantId the value for member.tenant_id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.email
     *
     * @return the value of member.email
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.email
     *
     * @param email the value for member.email
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.sys_role_ids
     *
     * @return the value of member.sys_role_ids
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public String getSysRoleIds() {
        return sysRoleIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.sys_role_ids
     *
     * @param sysRoleIds the value for member.sys_role_ids
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setSysRoleIds(String sysRoleIds) {
        this.sysRoleIds = sysRoleIds;
    }

    public void initDefault() {
        if (this.getNickName() == null) {
            this.setNickName("");
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
        if (this.getName() == null) {
            this.setName("");
        }
        if (this.getAvatarUrl() == null) {
            this.setAvatarUrl("");
        }
        if (this.getTenantId() == null) {
            this.setTenantId(0L);
        }
        if (this.getEmail() == null) {
            this.setEmail("");
        }
    }

    public void initUpdate() {
    }
}