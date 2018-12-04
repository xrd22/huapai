package com.huapai.scan.controller;


import com.huapai.scan.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class loginController {

    @Autowired
    private LoginService loginService;
    @RequestMapping("/text")
    @ResponseBody
    public String getTest() {
        return loginService.login();
    }

    @RequestMapping("/index")
    public String login() {
        return "index";
    }

    @RequestMapping("/chart")
    public String chart() {
        return "chart";
    }

}
