package com.example.demo02.service;

import com.example.demo02.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void listAllUser() {
        List<User> list =  userService.listAllUser();
        for (User u : list){
            System.out.println(u.toString());
        }
    }

    @Test
    void getUser() {
        Long id = 1L;
        User user = userService.getUser(id);
        System.out.println(user.toString());
    }

    @Test
    void createUser() {
        User user = new User(11L,"11","13100001000","12313@163.com");
        Integer i = userService.createUser(user);
        System.out.println(i);
    }

    @Test
    void deleteUser() {
        Integer i = userService.deleteUser(11L);
        System.out.println(i);
    }
}