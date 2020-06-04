package com.example.demo.controller;

import com.example.demo.StudentProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyw
 * @version 1.0
 * @date 2020/4/5 23:36
 */
@Slf4j
@RestController
public class HelloController {

    @Autowired
    StudentProperties student;

    /**
     * @author wyw
     * @date
     * @description
     */
    @GetMapping("/hello")
    public String hello() {
        log.error("hello slf4j");
        return "hello spring boot " + student.getName() + " " + student.getAge();
    }
}
