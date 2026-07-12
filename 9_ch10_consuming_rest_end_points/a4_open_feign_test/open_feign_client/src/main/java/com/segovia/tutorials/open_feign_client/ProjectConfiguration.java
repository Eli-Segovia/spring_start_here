package com.segovia.tutorials.open_feign_client;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(
        basePackages = "com.segovia.tutorials.open_feign_client"
)
public class ProjectConfiguration {
}
