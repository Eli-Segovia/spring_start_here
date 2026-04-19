package com.segovia.tutorials.spring_start_here_ch3_wiring_beans.config;

import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot("Koko");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) {            // Here spring injects the parrot
        Person p = new Person("Kingston");
        p.setParrot(parrot);
        return p;
    }
}
