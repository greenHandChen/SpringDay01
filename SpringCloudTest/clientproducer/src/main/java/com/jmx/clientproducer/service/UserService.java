package com.jmx.clientproducer.service;

import com.jmx.clientproducer.mapper.UserMapper;
import com.jmx.clientproducer.model.UserDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:
 * @Date:created in
 * @Description:
 */
@Service
@EnableAutoConfiguration
public class UserService {
    @Autowired
     UserMapper userMapper;
     public String  insertUser(UserDemo userDemo){
         userMapper.insertUser(userDemo);
         return userDemo.toString();
     }
     public String queryUser(){
         return userMapper.queryUser().toString();
     }

     public List<UserDemo> queryUserList(){
         return userMapper.queryUser();
     }
}
