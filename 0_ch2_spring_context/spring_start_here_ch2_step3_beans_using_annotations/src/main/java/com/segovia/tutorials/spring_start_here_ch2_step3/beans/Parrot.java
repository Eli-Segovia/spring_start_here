package com.segovia.tutorials.spring_start_here_ch2_step3.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/*
 * Dummy class that we will add  to our spring context
 * It is just a parrot.
 *
 * Here we tell spring to create an instance of parrot and add it to its context.
 *
 * If we are using annotations we need to tell Spring how to find it with component scan.
 */
@Component
public class Parrot {

    private String name;

    /**
     * Initializes this parrot with the name "Boba" after Spring has created this bean. Usually
     * We would actually get this from a DB or a configuration file, but here we are just
     * hardcoding for demo purposes
     */
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
}
