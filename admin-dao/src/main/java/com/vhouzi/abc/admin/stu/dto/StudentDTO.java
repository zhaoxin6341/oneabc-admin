package com.vhouzi.abc.admin.stu.dto;

import lombok.Data;

import java.util.Date;

@Data
public class StudentDTO {
    private Long openMemberId;
    private Long memberId;
    private String enName;
    private String realName;
    private String mobile;
    private Long credit;
    private Long engGradeScore;
    private String avatar;
    private Long status;
    private Long lockStatus;
    private Date activeTime;
    private Date createTime;
    private Date updateTime;
    private String createUser;
    private String updateUser;
    private Long invitorOpenMemberId;
}
