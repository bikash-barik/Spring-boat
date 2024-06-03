package com.Login_page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
//localhost:8080/register
    @GetMapping("/register")
    public String getRegisterPage() {
        return "register_page";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login_page";
    }
}
