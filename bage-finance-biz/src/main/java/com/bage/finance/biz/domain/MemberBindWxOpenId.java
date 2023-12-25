package com.bage.finance.biz.domain;

import java.util.Date;

/**
 * 用户表绑定微信openid表（表：member_bind_wx_openid）
 *
 * @author bage
 * @date 2023-12-26 02:05:30
 */
public class MemberBindWxOpenId {
    /**
     * 
     */
    private Long id;

    /**
     * 小程序或者公众号appid
     */
    private String appId;

    /**
     * 微信openid
     */
    private String openId;

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
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_wx_openid.id
     *
     * @return the value of member_bind_wx_openid.id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_wx_openid.id
     *
     * @param id the value for member_bind_wx_openid.id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_wx_openid.app_id
     *
     * @return the value of member_bind_wx_openid.app_id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_wx_openid.app_id
     *
     * @param appId the value for member_bind_wx_openid.app_id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_wx_openid.open_id
     *
     * @return the value of member_bind_wx_openid.open_id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_wx_openid.open_id
     *
     * @param openId the value for member_bind_wx_openid.open_id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_wx_openid.member_id
     *
     * @return the value of member_bind_wx_openid.member_id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_wx_openid.member_id
     *
     * @param memberId the value for member_bind_wx_openid.member_id
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_wx_openid.disable
     *
     * @return the value of member_bind_wx_openid.disable
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Boolean getDisable() {
        return disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_wx_openid.disable
     *
     * @param disable the value for member_bind_wx_openid.disable
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_wx_openid.create_time
     *
     * @return the value of member_bind_wx_openid.create_time
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_wx_openid.create_time
     *
     * @param createTime the value for member_bind_wx_openid.create_time
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_bind_wx_openid.update_time
     *
     * @return the value of member_bind_wx_openid.update_time
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_bind_wx_openid.update_time
     *
     * @param updateTime the value for member_bind_wx_openid.update_time
     *
     * @mbg.generated Tue Dec 26 02:05:30 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void initDefault() {
        if (this.getAppId() == null) {
            this.setAppId("");
        }
        if (this.getOpenId() == null) {
            this.setOpenId("");
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