package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;
import java.util.concurrent.DelayQueue;

/**
 * @author wyw
 * @version 1.0
 * @date 2020/5/5 19:05
 */

@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue() {
        return new DelayQueue();
    }
}
