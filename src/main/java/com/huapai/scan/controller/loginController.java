package com.huapai.scan.controller;


import com.huapai.scan.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

    @Autowired
    private LoginService loginService;
    @RequestMapping("login")
    public String getTest() {
        return loginService.login();
    }

}
