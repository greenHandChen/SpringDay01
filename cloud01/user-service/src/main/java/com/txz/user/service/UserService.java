package com.txz.user.service;

import com.txz.user.mapper.UserMapper;
import com.txz.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
