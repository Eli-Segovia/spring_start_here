package com.segovia.tutorials.spring_start_here_ch2_step1.configuration;

import com.segovia.tutorials.spring_start_here_ch2_step1.beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    // Note the spring convention for Configuration: the method name is
    // typically just what is returned. No "get" prefix needed.

    @Bean
    // Our Custom Class Parrot
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Bruce");
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
