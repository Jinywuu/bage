package com.bage.finance.biz.domain;

import java.util.Date;

/**
 * 系统配置（表：sys_config）
 *
 * @author bage
 * @date 2023-12-26 02:05:30
 */
public class SysConfig {
    /**
     * 
     */
    private Integer id;

    /**
     * 配置名称
     */
    private String configName;

    /**
     * 类型
     */
    private String type;

    /**
     * 配置key
     */
    private String configKey;

    /**
     * 配置内容
     */
    private String configValue;

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
     * This method returns the value of the database column sys_config.id
     *
     * @return the value of sys_config.id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.id
     *
     * @param id the value for sys_config.id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.config_name
     *
     * @return the value of sys_config.config_name
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.config_name
     *
     * @param configName the value for sys_config.config_name
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setConfigName(String configName) {
        this.configName = configName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.type
     *
     * @return the value of sys_config.type
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.type
     *
     * @param type the value for sys_config.type
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.config_key
     *
     * @return the value of sys_config.config_key
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.config_key
     *
     * @param configKey the value for sys_config.config_key
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.config_value
     *
     * @return the value of sys_config.config_value
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.config_value
     *
     * @param configValue the value for sys_config.config_value
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.create_time
     *
     * @return the value of sys_config.create_time
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.create_time
     *
     * @param createTime the value for sys_config.create_time
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.update_time
     *
     * @return the value of sys_config.update_time
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.update_time
     *
     * @param updateTime the value for sys_config.update_time
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.member_id
     *
     * @return the value of sys_config.member_id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.member_id
     *
     * @param memberId the value for sys_config.member_id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.update_member_id
     *
     * @return the value of sys_config.update_member_id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Long getUpdateMemberId() {
        return updateMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.update_member_id
     *
     * @param updateMemberId the value for sys_config.update_member_id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setUpdateMemberId(Long updateMemberId) {
        this.updateMemberId = updateMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.del_flag
     *
     * @return the value of sys_config.del_flag
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.del_flag
     *
     * @param delFlag the value for sys_config.del_flag
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.disable
     *
     * @return the value of sys_config.disable
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Boolean getDisable() {
        return disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.disable
     *
     * @param disable the value for sys_config.disable
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public void initDefault() {
        if (this.getConfigName() == null) {
            this.setConfigName("");
        }
        if (this.getType() == null) {
            this.setType("");
        }
        if (this.getConfigKey() == null) {
            this.setConfigKey("");
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