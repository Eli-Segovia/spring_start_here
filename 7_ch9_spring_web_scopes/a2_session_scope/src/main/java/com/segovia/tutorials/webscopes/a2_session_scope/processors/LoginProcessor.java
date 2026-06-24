package com.segovia.tutorials.webscopes.a2_session_scope.processors;

import com.segovia.tutorials.webscopes.a2_session_scope.services.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component    // tells spring to pick it up
@RequestScope // sets scope to Request if this wasn't here, we would use the same object for each request.
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;

    private String username; // gets username from request
    private String password; // gets password from request

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login() {
        String username = this.username;
        String password = this.password;

        if ("usernameFromDatabase".equals(username) && "passwordFromDatabase".equals(password)) {
            loggedUserManagementService.setUsername(username);
            return true;
        } else {
            loggedUserManagementService.setUsername(null);
            System.out.println(this);
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

