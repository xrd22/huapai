package com.huapai.scan.controller;


import com.huapai.scan.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class loginController {

    @Autowired
    private LoginService loginService;
    @RequestMapping("text")
    public String getTest() {
        return loginService.login();
    }

    @RequestMapping("/login")
    public String login() {
        return "index";
    }

}
