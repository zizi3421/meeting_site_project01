package com.meeting_site_project.YM.controller;

import ch.qos.logback.classic.Logger;
import com.meeting_site_project.YM.mapper.MemberMapper;
import com.meeting_site_project.YM.service.CheckService;
import com.meeting_site_project.YM.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("manager")
public class ManagerController {

    CheckService checkService;

    private MemberMapper memberService;

    @Autowired
    public ManagerController(CheckService checkService) {
        this.checkService = checkService;
    }

    @GetMapping("")
    public String createForm() {
        return "manager/main";
    }

    @GetMapping("memberList")
    public String getMemberList(Model model) { // 전체 회원을 조회하기 위한 컨트롤러

        List<Member> memberList = checkService.findMembers(); // service에서 멤버를 불러옴

        model.addAttribute("memberList", memberList); // model 객체로 memberList를 보내줌

        return "manager/memberList";
    }

    @GetMapping("memberEdit")
    public String editMemberPage(@RequestParam("userid") String userId, Model model) {
        // 특정 회원을 수정하는 페이지로 이동하는 로직을 구현
        // 데이터베이스에서 userId에 해당하는 회원 정보를 가져오는 로직을 구현

        Member member = checkService.selectMemberById(userId);

        model.addAttribute("member",member);

        return "manager/memberEdit"; // 수정 페이지로 이동
    }



    @GetMapping("delete/{userId}")
    public String deleteMember(@PathVariable("userId") String userId) {
        // 특정 회원을 삭제하는 로직을 구현
        // 회원을 삭제하고 회원 목록 페이지로 이동
        // 삭제 로직 구현
        return "redirect:/manager/memberList"; // 특정 회원 삭제 후 회원 목록 페이지로 리다이렉트
    }
}
