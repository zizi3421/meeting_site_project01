package com.meeting_site_project.YM.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


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
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date sign_date;
}
