package com.bage.finance.biz.domain;

import java.util.Date;

/**
 * 系统角色绑定资源资源（表：sys_role_bind_resource）
 *
 * @author bage
 * @date 2024-01-16 11:01:36
 */
public class SysRoleBindResource {
    /**
     * 
     */
    private Integer id;

    /**
     * 角色id
     */
    private Integer sysRoleId;

    /**
     * 资源id
     */
    private Integer sysResourceId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 用户id
     */
    private Long memberId;

    /**
     * 修改用户id
     */
    private Long updateMemberId;

    /**
     * 是否删除，0：删除，1：未删除
     */
    private Boolean delFlag;

    /**
     * 是否禁用
     */
    private Boolean disable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_bind_resource.id
     *
     * @return the value of sys_role_bind_resource.id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_bind_resource.id
     *
     * @param id the value for sys_role_bind_resource.id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_bind_resource.sys_role_id
     *
     * @return the value of sys_role_bind_resource.sys_role_id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Integer getSysRoleId() {
        return sysRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_bind_resource.sys_role_id
     *
     * @param sysRoleId the value for sys_role_bind_resource.sys_role_id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setSysRoleId(Integer sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_bind_resource.sys_resource_id
     *
     * @return the value of sys_role_bind_resource.sys_resource_id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Integer getSysResourceId() {
        return sysResourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_bind_resource.sys_resource_id
     *
     * @param sysResourceId the value for sys_role_bind_resource.sys_resource_id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setSysResourceId(Integer sysResourceId) {
        this.sysResourceId = sysResourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_bind_resource.create_time
     *
     * @return the value of sys_role_bind_resource.create_time
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_bind_resource.create_time
     *
     * @param createTime the value for sys_role_bind_resource.create_time
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_bind_resource.update_time
     *
     * @return the value of sys_role_bind_resource.update_time
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_bind_resource.update_time
     *
     * @param updateTime the value for sys_role_bind_resource.update_time
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_bind_resource.member_id
     *
     * @return the value of sys_role_bind_resource.member_id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_bind_resource.member_id
     *
     * @param memberId the value for sys_role_bind_resource.member_id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_bind_resource.update_member_id
     *
     * @return the value of sys_role_bind_resource.update_member_id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Long getUpdateMemberId() {
        return updateMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_bind_resource.update_member_id
     *
     * @param updateMemberId the value for sys_role_bind_resource.update_member_id
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setUpdateMemberId(Long updateMemberId) {
        this.updateMemberId = updateMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_bind_resource.del_flag
     *
     * @return the value of sys_role_bind_resource.del_flag
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_bind_resource.del_flag
     *
     * @param delFlag the value for sys_role_bind_resource.del_flag
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_bind_resource.disable
     *
     * @return the value of sys_role_bind_resource.disable
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public Boolean getDisable() {
        return disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_bind_resource.disable
     *
     * @param disable the value for sys_role_bind_resource.disable
     *
     * @mbg.generated Tue Jan 16 11:01:36 CST 2024
     */
    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public void initDefault() {
        if (this.getSysRoleId() == null) {
            this.setSysRoleId(0);
        }
        if (this.getSysResourceId() == null) {
            this.setSysResourceId(0);
        }
        if (this.getCreateTime() == null) {
            this.setCreateTime(new Date());
        }
        if (this.getUpdateTime() == null) {
            this.setUpdateTime(new Date());
        }
        if (this.getMemberId() == null) {
            this.setMemberId(0L);
        }
        if (this.getUpdateMemberId() == null) {
            this.setUpdateMemberId(0L);
        }
        if (this.getDelFlag() == null) {
            this.setDelFlag(false);
        }
        if (this.getDisable() == null) {
            this.setDisable(false);
        }
    }

    public void initUpdate() {
    }
}