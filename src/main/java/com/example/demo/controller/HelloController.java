package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyw
 * @version 1.0
 * @date 2020/4/5 23:36
 */
@RestController
public class HelloController {

    /**
     * @author wyw
     * @date
     * @description
     */
    @GetMapping("/hello")
    public String hello() {
       // log.error("hello slf4j");
        return "hello spring boot 1";
    }
}
