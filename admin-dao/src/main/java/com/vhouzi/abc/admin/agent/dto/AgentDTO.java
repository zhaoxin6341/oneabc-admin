package com.vhouzi.abc.admin.agent.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AgentDTO {
    private Long openMemberId;
    private Long memberId;
    private String realName;
    private String mobile;
    private Long memberType;
    private Long status;
    private Long lockStatus;
    private Date activeTime;
    private Date createTime;
    private Date updateTime;
    private String createUser;
    private String updateUser;
}
