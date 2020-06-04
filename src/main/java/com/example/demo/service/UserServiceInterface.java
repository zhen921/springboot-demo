package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author wyw
 * @version 1.0
 * @date 2020/4/25 15:28
 */
public interface UserServiceInterface {
    List<User> findAll();

    void saveUser(User user);

    List<User> queryAllUsers();

}
