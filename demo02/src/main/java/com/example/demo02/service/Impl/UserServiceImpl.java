package com.example.demo02.service.Impl;

import com.example.demo02.mapper.UserMapper;
import com.example.demo02.model.User;
import com.example.demo02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> listAllUser() {
        return userMapper.findAll();
    }

    @Override
    public User getUser(Long id){
        return userMapper.findOne(id);
    }

    @Override
    public int createUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userMapper.delete(id);
    }
}
