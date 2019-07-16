package com.hand.service.impl;

import com.hand.dao.UserDao;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void hello() {
        System.out.println("userService 收到hello");
        userDao.hello();
        System.out.println("userService 返回hi");
    }
}
