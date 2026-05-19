package com.segovia.tutorials.config;

import com.segovia.tutorials.aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.segovia.tutorials")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

}
