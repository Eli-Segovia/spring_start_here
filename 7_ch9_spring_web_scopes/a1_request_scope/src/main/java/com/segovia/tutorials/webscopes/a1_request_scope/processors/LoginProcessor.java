package com.segovia.tutorials.webscopes.a1_request_scope.processors;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component    // tells spring to pick it up
@RequestScope // sets scope to Request if this wasn't here, we would use the same object for each request.
public class LoginProcessor {

    private String username; // gets username from request
    private String password; // gets password from request

    public boolean login() {
        String username = this.username;
        String password = this.password;

        if ("usernameFromDatabase".equals(username) && "passwordFromDatabase".equals(password)) {
            return true;
        } else {
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
