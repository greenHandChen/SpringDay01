package com.tlq.service.impl;

import com.tlq.dao.UserMapper;
import com.tlq.enity.User;
import com.tlq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/19 16:27
 * @Version: V1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Integer id) {
        return userMapper.findUserById(10);
    }
}
