package com.segovia.tutorials.spring_start_here_ch2_step1.main;

import com.segovia.tutorials.spring_start_here_ch2_step1.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch2_step1.configuration.ProjectConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        /*
         * Here we have created our context and told Spring which Configuration to use
         * That configuration has defined our Parrot, and we can pull that parrot
         * from out of our context.
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Parrot p = context.getBean(Parrot.class);

        Integer ten = context.getBean(Integer.class);

        String hello = context.getBean(String.class);


        System.out.println(p.getName());
        System.out.println(ten);
        System.out.println(hello);

    }
}
