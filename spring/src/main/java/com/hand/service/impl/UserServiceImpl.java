package com.hand.service.impl;

import com.hand.DAO.UserDAO;
import com.hand.entity.User;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDAO")
    private UserDAO userDAO;

    public void addUser() {
        System.out.println("开始添加用户");
        userDAO.addUser();
    }
}
