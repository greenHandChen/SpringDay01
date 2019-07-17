package com.hand.dao.impl;

import com.hand.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void hello() {
        System.out.println("userDao 收到hello");
        System.out.println("userDao 返回hi");
    }
}
