package com.vhouzi.abc.admin.stu.domain;

import java.util.Date;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.open_member_id
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private Long openMemberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.member_id
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private Long memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.en_name
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private String enName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.real_name
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.mobile
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.credit
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private Long credit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.eng_grade_score
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private Long engGradeScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.avatar
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private String avatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.status
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private Long status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.lock_status
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private Long lockStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.active_time
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private Date activeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.create_time
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.update_time
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.create_user
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.update_user
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.invitor_open_member_id
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private Long invitorOpenMemberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_tm_student.password
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.open_member_id
     *
     * @return the value of member_tm_student.open_member_id
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public Long getOpenMemberId() {
        return openMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.open_member_id
     *
     * @param openMemberId the value for member_tm_student.open_member_id
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setOpenMemberId(Long openMemberId) {
        this.openMemberId = openMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.member_id
     *
     * @return the value of member_tm_student.member_id
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.member_id
     *
     * @param memberId the value for member_tm_student.member_id
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.en_name
     *
     * @return the value of member_tm_student.en_name
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public String getEnName() {
        return enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.en_name
     *
     * @param enName the value for member_tm_student.en_name
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.real_name
     *
     * @return the value of member_tm_student.real_name
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.real_name
     *
     * @param realName the value for member_tm_student.real_name
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.mobile
     *
     * @return the value of member_tm_student.mobile
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.mobile
     *
     * @param mobile the value for member_tm_student.mobile
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.credit
     *
     * @return the value of member_tm_student.credit
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public Long getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.credit
     *
     * @param credit the value for member_tm_student.credit
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setCredit(Long credit) {
        this.credit = credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.eng_grade_score
     *
     * @return the value of member_tm_student.eng_grade_score
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public Long getEngGradeScore() {
        return engGradeScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.eng_grade_score
     *
     * @param engGradeScore the value for member_tm_student.eng_grade_score
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setEngGradeScore(Long engGradeScore) {
        this.engGradeScore = engGradeScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.avatar
     *
     * @return the value of member_tm_student.avatar
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.avatar
     *
     * @param avatar the value for member_tm_student.avatar
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.status
     *
     * @return the value of member_tm_student.status
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.status
     *
     * @param status the value for member_tm_student.status
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.lock_status
     *
     * @return the value of member_tm_student.lock_status
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public Long getLockStatus() {
        return lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.lock_status
     *
     * @param lockStatus the value for member_tm_student.lock_status
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setLockStatus(Long lockStatus) {
        this.lockStatus = lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.active_time
     *
     * @return the value of member_tm_student.active_time
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public Date getActiveTime() {
        return activeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.active_time
     *
     * @param activeTime the value for member_tm_student.active_time
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.create_time
     *
     * @return the value of member_tm_student.create_time
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.create_time
     *
     * @param createTime the value for member_tm_student.create_time
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.update_time
     *
     * @return the value of member_tm_student.update_time
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.update_time
     *
     * @param updateTime the value for member_tm_student.update_time
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.create_user
     *
     * @return the value of member_tm_student.create_user
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.create_user
     *
     * @param createUser the value for member_tm_student.create_user
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.update_user
     *
     * @return the value of member_tm_student.update_user
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.update_user
     *
     * @param updateUser the value for member_tm_student.update_user
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.invitor_open_member_id
     *
     * @return the value of member_tm_student.invitor_open_member_id
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public Long getInvitorOpenMemberId() {
        return invitorOpenMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.invitor_open_member_id
     *
     * @param invitorOpenMemberId the value for member_tm_student.invitor_open_member_id
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setInvitorOpenMemberId(Long invitorOpenMemberId) {
        this.invitorOpenMemberId = invitorOpenMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_tm_student.password
     *
     * @return the value of member_tm_student.password
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_tm_student.password
     *
     * @param password the value for member_tm_student.password
     *
     * @mbggenerated Tue Jan 07 23:36:04 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}