package com.segovia.tutorials.spring_start_here_ch2_step3.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// Component Scan is based on packages. Here we are telling it to start at com/segovia/tutorials
@ComponentScan(basePackages = "com.segovia.tutorials")
public class ProjectConfiguration {
}
