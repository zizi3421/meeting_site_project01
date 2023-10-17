package com.meeting_site_project.YM.vo;

import lombok.Data;

@Data
public class JoinMember {
    private String UserId;
    private String userName;
    private String userPicture;
    private String userMbti;
    private String userPassword;
    private String confirmUserPassword;
    private String userInfo;
    private String birthday;
    private String nickName;
}
