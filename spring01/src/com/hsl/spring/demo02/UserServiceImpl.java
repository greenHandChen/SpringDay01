package com.hsl.spring.demo02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserDAO userDAO;
    @Override
    public void find() {
        System.out.println("service....");
        userDAO.find();
    }
}
