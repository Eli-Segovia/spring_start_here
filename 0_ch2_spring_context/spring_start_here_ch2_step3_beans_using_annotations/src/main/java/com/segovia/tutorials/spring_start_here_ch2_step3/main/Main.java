package com.segovia.tutorials.spring_start_here_ch2_step3.main;

import com.segovia.tutorials.spring_start_here_ch2_step3.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch2_step3.configuration.ProjectConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        /*
         * Here we have created our context and told Spring which Configuration to use
         * That configuration has told Spring how to find the Parrot component
         * It will pull this Parrot component and add it to the context.
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Parrot nuestroPerico = context.getBean(Parrot.class);

        System.out.println(nuestroPerico.getName());

    }
}
