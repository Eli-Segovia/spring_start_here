package com.segovia.tutorials.spring_start_here_ch2_step2.configuration;

import com.segovia.tutorials.spring_start_here_ch2_step2.beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    // Note the spring convention for Configuration: the method name is
    // typically just what is returned. No "get" prefix needed.

    @Bean
    // Our Custom Class Parrot
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Bruce");
        return p;
    }

    @Bean("boba")
    // Our second parrot... We want to give it a custom bean name of "boba"
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Boba");
        return p;
    }

    @Bean
    // Our third parrot
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Bart");
        return p;
    }

    @Bean
    // Can also just return "primitive" types
    String hello() {
        return "hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
