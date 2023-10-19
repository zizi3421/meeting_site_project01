package com.meeting_site_project.YM.mapper;

import com.meeting_site_project.YM.vo.JoinMember;
import com.meeting_site_project.YM.vo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

    @Select("select count(*) from member")
    public int getCnt();

    public int getCnt2();

    public void insertMember(JoinMember joinMember);

    public Member selectByIdPassword(String userId, String userPassword);

    public Member selectById(String userId);

    public Member selectByNickName(String nickName);

    public Member selectByEmail(String emailId, String emailDomain);
}
