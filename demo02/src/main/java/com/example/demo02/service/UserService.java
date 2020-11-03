package com.example.demo02.service;

import com.example.demo02.mapper.UserMapper;
import com.example.demo02.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {

    List<User> listAllUser();

    User getUser(Long id);

    int createUser(User user);

    int deleteUser(Long id);
}
