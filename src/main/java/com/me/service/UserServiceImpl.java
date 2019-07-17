package com.me.service;

import com.me.entity.User;
import com.me.dao.IUSerDao;
import com.me.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {
    
    private IUSerDao userDao;
    public void setuDao(IUSerDao userDao) {
        this.userDao = userDao;
    }
    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    public int removeUser(Integer id) {
        return userDao.deleteUser(id);
    }

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    public User getUserById(Integer id) {
        return userDao.selectUserById(id);
    }
}
