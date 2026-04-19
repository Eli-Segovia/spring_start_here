package com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private Parrot parrot;

    @Autowired
    public Person(Parrot p) {
        this.parrot = p;
    }

    @PostConstruct
    public void init() {
        this.name = "Kingston";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParrot(Parrot p) {this.parrot = p;}

    public Parrot getParrot() {
        return parrot;
    }

}
