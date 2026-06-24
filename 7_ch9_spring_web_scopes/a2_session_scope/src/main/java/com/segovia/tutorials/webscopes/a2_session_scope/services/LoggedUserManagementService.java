package com.segovia.tutorials.webscopes.a2_session_scope.services;

import org.springframework.stereotype.Component;

@Component
public class LoggedUserManagementService {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
