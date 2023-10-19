package com.meeting_site_project.YM.controller;

import com.meeting_site_project.YM.service.JoinService;
import com.meeting_site_project.YM.vo.JoinMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {

    JoinService joinService;
    @Autowired
    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @GetMapping("/join")
    public String loginForm() {

        return "join/joinForm";
    }

    @GetMapping("joinSuccess")
    public String mainReturn() {
        return "home";
    }

    @PostMapping("/joinSuccess")
    public String joinSuccess(JoinMember joinMember ) {

        joinService.insertMember(joinMember);
        return "join/joinSuccess";
    }


}
