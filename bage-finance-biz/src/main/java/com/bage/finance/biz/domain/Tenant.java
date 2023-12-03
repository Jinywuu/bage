package com.bage.finance.biz.domain;

import java.util.Date;

/**
 * 租户表（表：tenant）
 *
 * @author bage
 * @date 2023-11-30 13:03:14
 */
public class Tenant {
    /**
     * 
     */
    private Long id;

    /**
     * 租户名称
     */
    private String name;

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
     * 管理员id
     */
    private Long adminId;

    /**
     * 修改管理员id
     */
    private Long updateAdminId;

    /**
     * 是否删除，0：删除，1：未删除
     */
    private Boolean delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenant.id
     *
     * @return the value of tenant.id
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenant.id
     *
     * @param id the value for tenant.id
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenant.name
     *
     * @return the value of tenant.name
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenant.name
     *
     * @param name the value for tenant.name
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenant.disable
     *
     * @return the value of tenant.disable
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public Boolean getDisable() {
        return disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenant.disable
     *
     * @param disable the value for tenant.disable
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenant.create_time
     *
     * @return the value of tenant.create_time
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenant.create_time
     *
     * @param createTime the value for tenant.create_time
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenant.update_time
     *
     * @return the value of tenant.update_time
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenant.update_time
     *
     * @param updateTime the value for tenant.update_time
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenant.admin_id
     *
     * @return the value of tenant.admin_id
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenant.admin_id
     *
     * @param adminId the value for tenant.admin_id
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenant.update_admin_id
     *
     * @return the value of tenant.update_admin_id
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public Long getUpdateAdminId() {
        return updateAdminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenant.update_admin_id
     *
     * @param updateAdminId the value for tenant.update_admin_id
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public void setUpdateAdminId(Long updateAdminId) {
        this.updateAdminId = updateAdminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenant.del_flag
     *
     * @return the value of tenant.del_flag
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenant.del_flag
     *
     * @param delFlag the value for tenant.del_flag
     *
     * @mbg.generated Thu Nov 30 13:03:14 CST 2023
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public void initDefault() {
        if (this.getName() == null) {
            this.setName("");
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
        if (this.getAdminId() == null) {
            this.setAdminId(0L);
        }
        if (this.getUpdateAdminId() == null) {
            this.setUpdateAdminId(0L);
        }
        if (this.getDelFlag() == null) {
            this.setDelFlag(false);
        }
    }

    public void initUpdate() {
    }
}