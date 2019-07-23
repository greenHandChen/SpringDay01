package com.springbootdemo.service;

import com.springbootdemo.dto.UserDemo;
import com.springbootdemo.mapper.UserDemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDemoServiceImpl implements IUserDemoService {

    @Autowired
    private UserDemoMapper userDemoMapper;
    @Override
    public List<UserDemo> queryUserDemo() {
        return userDemoMapper.queryUserDemo();
    }
}
