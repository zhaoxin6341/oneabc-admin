package com.vhouzi.abc.admin.stu.domain;

import java.util.Date;

public class StuGradeHisto {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_th_grade.id
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_th_grade.student_member_id
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    private Long studentMemberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_th_grade.old_eng_grade_score
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    private Long oldEngGradeScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_th_grade.new_eng_grade_score
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    private Long newEngGradeScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_th_grade.update_time
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_th_grade.update_user
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    private String updateUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_th_grade.id
     *
     * @return the value of student_th_grade.id
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_th_grade.id
     *
     * @param id the value for student_th_grade.id
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_th_grade.student_member_id
     *
     * @return the value of student_th_grade.student_member_id
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public Long getStudentMemberId() {
        return studentMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_th_grade.student_member_id
     *
     * @param studentMemberId the value for student_th_grade.student_member_id
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public void setStudentMemberId(Long studentMemberId) {
        this.studentMemberId = studentMemberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_th_grade.old_eng_grade_score
     *
     * @return the value of student_th_grade.old_eng_grade_score
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public Long getOldEngGradeScore() {
        return oldEngGradeScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_th_grade.old_eng_grade_score
     *
     * @param oldEngGradeScore the value for student_th_grade.old_eng_grade_score
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public void setOldEngGradeScore(Long oldEngGradeScore) {
        this.oldEngGradeScore = oldEngGradeScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_th_grade.new_eng_grade_score
     *
     * @return the value of student_th_grade.new_eng_grade_score
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public Long getNewEngGradeScore() {
        return newEngGradeScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_th_grade.new_eng_grade_score
     *
     * @param newEngGradeScore the value for student_th_grade.new_eng_grade_score
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public void setNewEngGradeScore(Long newEngGradeScore) {
        this.newEngGradeScore = newEngGradeScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_th_grade.update_time
     *
     * @return the value of student_th_grade.update_time
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_th_grade.update_time
     *
     * @param updateTime the value for student_th_grade.update_time
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_th_grade.update_user
     *
     * @return the value of student_th_grade.update_user
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_th_grade.update_user
     *
     * @param updateUser the value for student_th_grade.update_user
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}