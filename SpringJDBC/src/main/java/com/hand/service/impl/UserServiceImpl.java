package com.hand.service.impl;

import com.hand.bean.User;
import com.hand.dao.IUSerDao;
import com.hand.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
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
