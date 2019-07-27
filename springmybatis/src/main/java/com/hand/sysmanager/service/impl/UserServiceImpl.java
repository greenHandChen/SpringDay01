package com.hand.sysmanager.service.impl;

import com.hand.sysmanager.entity.User;
import com.hand.sysmanager.mapper.UserMapper;
import com.hand.sysmanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/19 16:34
 */
@Service
public class UserServiceImpl implements IUserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(Long id) {
        return userMapper.findUserById(10L);
    }
}
