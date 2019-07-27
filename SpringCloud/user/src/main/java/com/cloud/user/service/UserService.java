package com.cloud.user.service;

import com.cloud.user.entity.User;
import com.cloud.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id){
        return userMapper.findById(id);
    }

    public List<User> findAll(){return userMapper.findAll();}

    public Integer addUser(User user){
        return userMapper.addUser(user);
    }

    public Integer updateUser(User user){
        return userMapper.updateUser(user);
    }

    public Integer deleteUser(Integer id){
        return userMapper.deleteUser(id);
    }
}
