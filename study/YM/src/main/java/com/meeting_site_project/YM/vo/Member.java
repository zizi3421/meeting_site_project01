package com.meeting_site_project.YM.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private String UserId;
    private String userName;
    private String userPicture;
    private String userMbti;
    private String userPassword;
    private String userInfo;
    private int userAdmin;
    private String birthday;
    private String nickName;
}
