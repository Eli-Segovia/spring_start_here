package com.segovia.tutorials.spring_start_here_ch3_wiring_beans.config;

import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans")
public class ProjectConfiguration {

    @Bean
    public Parrot parrot1(){
        Parrot parrot1 = new Parrot();
        parrot1.setName("Boba");
        return parrot1;
    }

    @Bean
    public Parrot parrot2(){
        Parrot parrot2 = new Parrot();
        parrot2.setName("Juana");
        return parrot2;
    }

    @Bean
    public Person person1(Parrot parrot1) { // should be injecting the parrot by paramater name (parrot1), but no
        Person person1 = new Person();      // this behavior is not guaranteed.
        person1.setName("Jack");
        person1.setParrot(parrot1);
        return person1;
    }
}
