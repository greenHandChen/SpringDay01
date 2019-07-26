package com.zhang.userprovider.service.Impl;

import com.zhang.userprovider.dao.UserDao;
import com.zhang.userprovider.pojo.User;
import com.zhang.userprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UserServiceImpl
 * Author:ZhangChunjia
 * Date:2019/7/26 9:26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = true)
    private UserDao userDao;


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public Integer addUser(User user) {
        Integer i = userDao.addUser(user);
        if (i == 1) {
            return 1;
        } else
            return 0;
    }

    @Override
    public Integer deleteUser(Integer id) {
        Integer i = userDao.deleteUser(id);
        if (i == 1) {
            return 1;
        } else
            return 0;
    }

    @Override
    public Integer updateUser(User user) {
        Integer i = userDao.updateUser(user);

        if (i == 1) {
            return 1;
        } else
            return 0;
    }
}
