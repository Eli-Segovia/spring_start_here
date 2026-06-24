package com.segovia.tutorials.webscopes.a2_session_scope.controllers;

import com.segovia.tutorials.webscopes.a2_session_scope.services.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class MainPageController {
    private final LoggedUserManagementService loggedUserManagementService; // we use this to see if logged in already

    public MainPageController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @RequestMapping("/main")
    public String getHome() {
        String username = loggedUserManagementService.getUsername();
        if (username == null ) {
            return "redirect:/"; // redirects to login page.
        }
        return "main.html";
    }
}
