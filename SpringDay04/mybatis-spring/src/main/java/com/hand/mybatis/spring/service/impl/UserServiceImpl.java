package com.hand.mybatis.spring.service.impl;

import com.hand.mybatis.spring.dao.UserDao;
import com.hand.mybatis.spring.pojo.User;
import com.hand.mybatis.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 王俊
 * @Date: 2019/7/19 14:48
 **/
@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }
}
