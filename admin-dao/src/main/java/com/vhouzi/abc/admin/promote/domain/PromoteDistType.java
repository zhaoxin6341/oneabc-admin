package com.vhouzi.abc.admin.promote.domain;

import java.util.Date;

public class PromoteDistType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distribution_tm_type.id
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distribution_tm_type.name
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distribution_tm_type.status
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    private Long status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distribution_tm_type.create_time
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column distribution_tm_type.create_user
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    private String createUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distribution_tm_type.id
     *
     * @return the value of distribution_tm_type.id
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distribution_tm_type.id
     *
     * @param id the value for distribution_tm_type.id
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distribution_tm_type.name
     *
     * @return the value of distribution_tm_type.name
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distribution_tm_type.name
     *
     * @param name the value for distribution_tm_type.name
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distribution_tm_type.status
     *
     * @return the value of distribution_tm_type.status
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distribution_tm_type.status
     *
     * @param status the value for distribution_tm_type.status
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distribution_tm_type.create_time
     *
     * @return the value of distribution_tm_type.create_time
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distribution_tm_type.create_time
     *
     * @param createTime the value for distribution_tm_type.create_time
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column distribution_tm_type.create_user
     *
     * @return the value of distribution_tm_type.create_user
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column distribution_tm_type.create_user
     *
     * @param createUser the value for distribution_tm_type.create_user
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }
}