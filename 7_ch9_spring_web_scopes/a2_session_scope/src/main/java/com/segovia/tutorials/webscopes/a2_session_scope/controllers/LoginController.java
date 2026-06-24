package com.segovia.tutorials.webscopes.a2_session_scope.controllers;


import com.segovia.tutorials.webscopes.a2_session_scope.processors.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @RequestMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String loginPost(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        loginProcessor.setPassword(password);
        loginProcessor.setUsername(username);
        boolean loggedIn = loginProcessor.login();

        if(loggedIn) {
            model.addAttribute("message", "You are now logged in!");
        } else {
            model.addAttribute("message", "You are not logged in!");
        }


        return "login.html";
    }
}
