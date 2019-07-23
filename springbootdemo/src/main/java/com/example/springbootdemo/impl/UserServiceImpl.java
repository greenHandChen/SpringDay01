package com.example.springbootdemo.impl;

import com.example.springbootdemo.bean.User;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUserInfo() {
        return userMapper.queryUserInfo();
    }
}
