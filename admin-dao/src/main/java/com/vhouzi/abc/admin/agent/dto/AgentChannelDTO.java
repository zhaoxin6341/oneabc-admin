package com.vhouzi.abc.admin.agent.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AgentChannelDTO {
    private Long openMemberId;
    private Long memberId;
    private String realName;
    private String mobile;
    private Long status;
    private Long lockStatus;
    private Date activeTime;
    private Date createTime;
}
