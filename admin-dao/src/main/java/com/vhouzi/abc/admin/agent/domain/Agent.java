package com.vhouzi.abc.admin.agent.domain;

import java.util.Date;

public class Agent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.open_member_id
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private Long openMemberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.member_id
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private Long memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.real_name
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.mobile
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.member_type
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private Long memberType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.status
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private Long status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.lock_status
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private Long lockStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.active_time
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private Date activeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.create_time
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.update_time
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.create_user
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_agent.update_user
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    private String updateUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.open_member_id
     *
     * @return the value of member_tm_agent.open_member_id
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public Long getOpenMemberId() {
        return openMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.open_member_id
     *
     * @param openMemberId the value for member_tm_agent.open_member_id
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setOpenMemberId(Long openMemberId) {
        this.openMemberId = openMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.member_id
     *
     * @return the value of member_tm_agent.member_id
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.member_id
     *
     * @param memberId the value for member_tm_agent.member_id
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.real_name
     *
     * @return the value of member_tm_agent.real_name
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.real_name
     *
     * @param realName the value for member_tm_agent.real_name
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.mobile
     *
     * @return the value of member_tm_agent.mobile
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.mobile
     *
     * @param mobile the value for member_tm_agent.mobile
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.member_type
     *
     * @return the value of member_tm_agent.member_type
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public Long getMemberType() {
        return memberType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.member_type
     *
     * @param memberType the value for member_tm_agent.member_type
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setMemberType(Long memberType) {
        this.memberType = memberType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.status
     *
     * @return the value of member_tm_agent.status
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.status
     *
     * @param status the value for member_tm_agent.status
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.lock_status
     *
     * @return the value of member_tm_agent.lock_status
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public Long getLockStatus() {
        return lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.lock_status
     *
     * @param lockStatus the value for member_tm_agent.lock_status
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setLockStatus(Long lockStatus) {
        this.lockStatus = lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.active_time
     *
     * @return the value of member_tm_agent.active_time
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public Date getActiveTime() {
        return activeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.active_time
     *
     * @param activeTime the value for member_tm_agent.active_time
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.create_time
     *
     * @return the value of member_tm_agent.create_time
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.create_time
     *
     * @param createTime the value for member_tm_agent.create_time
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.update_time
     *
     * @return the value of member_tm_agent.update_time
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.update_time
     *
     * @param updateTime the value for member_tm_agent.update_time
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.create_user
     *
     * @return the value of member_tm_agent.create_user
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.create_user
     *
     * @param createUser the value for member_tm_agent.create_user
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_agent.update_user
     *
     * @return the value of member_tm_agent.update_user
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_agent.update_user
     *
     * @param updateUser the value for member_tm_agent.update_user
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}