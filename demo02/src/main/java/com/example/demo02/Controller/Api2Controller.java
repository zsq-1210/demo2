package com.example.demo02.Controller;

import com.example.demo02.mapper.UserRepository;
import com.example.demo02.model.User;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Api2Controller {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "addUser")
    public void addUser(User user){
        userRepository.save(user);
    }

    @DeleteMapping(path = "deleteUser")
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    @RequestMapping("/list")
    public List<User> UserList(){
        return userRepository.findAll();
    }


}
