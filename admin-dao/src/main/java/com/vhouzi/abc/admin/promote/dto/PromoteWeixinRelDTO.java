package com.vhouzi.abc.admin.promote.dto;

import lombok.Data;

@Data
public class PromoteWeixinRelDTO {
    private Long memberId;
    private Long openMemberId;
    private String openid;
    private String nickname;
    private Long sex;
    private String province;
    private String city;
    private String country;
    private String headimgurl;
    private String privilege;
    private String unionid;
    private Long subscribeTime;
    private Long groupid;
    private String tagidList;
    private String subscribeScene;
    private Long qrScene;
    private String qrSceneStr;
}
