package com.hand.user.service.impl;

import com.hand.user.entity.User;
import com.hand.user.mapper.UserMapper;
import com.hand.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Ervin
 * @date:2019/7/26
 * @description:
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findUserById(int id) {
       return userMapper.findUserById(id);
    }
}
