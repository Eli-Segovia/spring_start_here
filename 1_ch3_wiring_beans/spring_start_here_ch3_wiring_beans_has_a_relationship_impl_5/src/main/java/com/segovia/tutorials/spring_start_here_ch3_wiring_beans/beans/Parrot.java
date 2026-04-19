package com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name;

    @PostConstruct
    public void init() {
        this.name = "Boba";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
