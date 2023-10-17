package com.meeting_site_project.YM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinController {

    @GetMapping("/join")
    public String loginForm() {
        return "join/joinForm";
    }
}
