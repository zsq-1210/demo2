package com.example.demo02.mapper;

import com.example.demo02.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;


public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>, Serializable {

}
