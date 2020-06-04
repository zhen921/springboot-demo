package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wyw
 * @version 1.0
 * @date 2020/4/25 15:35
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceInterface userServiceInterface;

    @GetMapping
    public List<User> findAll() {
        return userServiceInterface.findAll();
    }

    @PostMapping
    public void saveUser(@RequestBody User user) {
        userServiceInterface.saveUser(user);
    }

}
