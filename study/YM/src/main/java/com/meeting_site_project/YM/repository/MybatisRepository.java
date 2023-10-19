package com.meeting_site_project.YM.repository;


import com.meeting_site_project.YM.mapper.MemberMapper;
import com.meeting_site_project.YM.vo.JoinMember;
import com.meeting_site_project.YM.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Repository
public class MybatisRepository implements Repository{

    MemberMapper memberMapper;
    @Autowired
    public MybatisRepository(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public void insertMember(JoinMember joinMember) {
        memberMapper.insertMember(joinMember);
    }

    public Member selectById(String  userId) {
        return memberMapper.selectById(userId);
    }

    public List<Member> getMemberList() { // 전체 회원 조회를 위한 (관리자)
        return memberMapper.getMemberList();
    }

    public Member selectMemberById(String userId) {
        return memberMapper.selectMemberById(userId);

    }
}
