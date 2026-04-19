package com.segovia.tutorials.spring_start_here_ch3_wiring_beans.config;

import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Parrot;
import com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans")
public class ProjectConfiguration {
}
