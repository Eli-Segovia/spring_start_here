package com.segovia.tutorials.spring_start_here_ch2_step5.main;

import com.segovia.tutorials.spring_start_here_ch2_step5.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch2_step5.configuration.ProjectConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Need to use GenericApplicationContext to register beans programmatically
        GenericApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        // instead of using annotations or beans, we create the instance, and we register it
        // so that spring controls it.

        Parrot bobaBird = new Parrot();
        bobaBird.setName("Boba");

        // we use registerBean to register the bean. It takes 4 arguments
        //    - String                   -- the name we want to register the bean with
        //    - Class<T>                 -- the class of the Bean (Parrot.class)
        //    - Supplier<T>              -- supplies the instance of the Bean
        //    - BeanDefinitionCustomizer -- a varargs argument that gives extra customizations. ignore for now
        context.registerBean("bobaBean", Parrot.class, () -> bobaBird);

        Parrot springBobaBird = context.getBean(Parrot.class);


        System.out.println(springBobaBird.getName());



    }
}
