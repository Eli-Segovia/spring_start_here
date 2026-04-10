package com.segovia.tutorials.spring_start_here_ch2_step2.main;

import com.segovia.tutorials.spring_start_here_ch2_step2.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch2_step2.configuration.ProjectConfiguration;
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

        // Cannot do this anymore because we added more Parrots. Too ambiguous.
        // We _can_ actually do this, but we have to mark one of the beans as @Primary
        // Parrot p = context.getBean(Parrot.class);

        // Instead, we can grab our particular bean by the "bean name" which is the same as the method name
        // in the configuration class. We can also customize the name as you see in the Configuration

        Parrot p1 = context.getBean("parrot1", Parrot.class);
        Parrot p2 = context.getBean("boba", Parrot.class);     // this is the one we used the custom name for.
        Parrot p3 = context.getBean("parrot3", Parrot.class);

        Integer ten = context.getBean(Integer.class);

        String hello = context.getBean(String.class);


        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        System.out.println(ten);
        System.out.println(hello);

    }
}
