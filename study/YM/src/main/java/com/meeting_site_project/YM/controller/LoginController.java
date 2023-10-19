package com.meeting_site_project.YM.controller;

import com.meeting_site_project.YM.service.AuthService;
import com.meeting_site_project.YM.vo.AuthInfo;
import com.meeting_site_project.YM.vo.LoginCommand;
import com.meeting_site_project.YM.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class LoginController {
    AuthService authService;
    @Autowired
    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    public abstract class SessionConst {
        public static final String LOGIN_MEMBER = "loginMember";

    }

    @GetMapping("/login")
    public String loginForm(@ModelAttribute("loginInfo") LoginCommand loginCommand, HttpServletRequest request, HttpSession session) {
        AuthInfo authInfo = (AuthInfo) session.getAttribute(SessionConst.LOGIN_MEMBER);
        if(authInfo != null) {
            return "home";
        }
        return "login/loginForm";
    }

    @PostMapping("/login")
    public String loginSuccess(@Valid @ModelAttribute("loginInfo") LoginCommand loginCommand, BindingResult bindingResult, HttpSession session, HttpServletRequest request) {
        if(bindingResult.hasErrors()) {
            return "login/loginForm";
        }

        Member member = authService.selectById(loginCommand.getUserId(), loginCommand.getUserPassword());
        if(member==null) {
            bindingResult.reject("loginfail", "아이디 또는 비밀번호를 확인해주세요.");
            return "login/loginForm";
        }

        AuthInfo authInfo = new AuthInfo(member.getUserId(), member.getUserPassword(), member.getUserName(), member.getNickName(), member.getUserPicture(), member.getUserAdmin());
        session = request.getSession(true);
        session.setAttribute(SessionConst.LOGIN_MEMBER, authInfo);


        return "home";
    }
}
