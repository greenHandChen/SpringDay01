package com.hand.service;

import com.hand.domain.User;
import com.hand.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User findUser(Integer id){
        User user = userMapper.findById(id);
        return user;
    }
}
