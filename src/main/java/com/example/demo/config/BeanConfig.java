package com.example.demo.config;

import com.example.demo.database.service.UserServiceInterface;
import com.example.demo.database.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    UserServiceInterface userServiceInterface() {
        return new UserServiceImpl();
    }
}

