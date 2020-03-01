package com.vhouzi.abc.admin.promote.dto;

import lombok.Data;

@Data
public class PromoteMetaDTO {
    private Long id;
    private String unicode;
    private Long memberId;
    private Long openMemberId;
    private Long promoteType;
    private String content;
    private Long expires;
    private Long memberCardId;
    private String extention;
    private Integer memberCardType;
    private String memberCardName;
}
