package com.example.demo.database.service.impl;

import com.example.demo.database.entity.User;
import com.example.demo.database.repository.UserRepository;
import com.example.demo.database.service.UserServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wyw
 * @version 1.0
 * @date 2020/4/25 15:29
 */
@Slf4j
public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> queryAllUsers() {
        return userRepository.queryAllUsers();
    }
}
