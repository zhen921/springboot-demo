package com.example.demo.repository;

import com.example.demo.entity.User;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.sun.javafx.scene.traversal.Direction;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;

import javax.validation.constraints.Max;
import java.io.Console;
import java.util.Arrays;
import java.util.List;

/**
 * @author wyw
 * @version 1.0
 * @date 2020/4/25 16:44
 */
@Slf4j
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void findAll() {
        List<User> users = userRepository.findAll();
        Assert.notEmpty(users);
        System.out.println(users.get(0).getName());
    }

    @Test
    public void findAllByPasswordContains() {

        List<User> users = userRepository.findAllByPasswordIn(Arrays.asList("qwer", "eeee"));
        System.out.println(users.size());
        System.out.println(users.get(0).getName() + " " + users.get(1).getName());
    }

    @Test
    public void findAllpage() {
        int page = 1, size = 10;
        //Sort sort = new Sort(, Arrays.asList("qwer","eeee"))
        //Pageable pageable =new PageRequest(page,size,null);
        List<User> users = userRepository.findAll();
        System.out.println(users.size());
        System.out.println(users.get(0).getName() + " " + users.get(1).getName());
    }

    @Test
    public void queryAllUsers() {
        List<User> users = userRepository.queryAllUsers();
        System.out.println(users.size());
        System.out.println(users.get(0).getName() + " " + users.get(1).getName());
    }

    @Test
    public void updateUserById() {
        userRepository.updateUserById("wang", 1);
    }


    @Test
    public void queryUserByName() {
        User users = userRepository.queryUserByName("name");
        System.out.println(users.getName());
    }

    @Test
    public void deleteUserByName() {
        userRepository.deleteUserByName("name");
    }
}