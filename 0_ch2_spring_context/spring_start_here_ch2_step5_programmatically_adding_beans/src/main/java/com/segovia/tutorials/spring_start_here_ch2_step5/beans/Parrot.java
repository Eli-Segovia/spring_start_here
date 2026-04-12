package com.segovia.tutorials.spring_start_here_ch2_step5.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/*
 * Dummy class that we will add  to our spring context
 * It is just a parrot.
 */
@Component
public class Parrot {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
