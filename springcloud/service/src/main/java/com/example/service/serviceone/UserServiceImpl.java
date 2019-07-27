package com.example.service.serviceone;

import com.example.service.dao.UserDao;
import com.example.service.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUserList() {
        return userDao.findAll();
    }

    @Override
    public User findUserById(long id) {
        return userDao.findById(id);
    }

    @Override
    public void save(User user) {
            userDao.save(user);
    }

    @Override
    public void edit(User user) {
            userDao.save(user);
    }

    @Override
    public void delete(long id) {
        userDao.deleteById(id);
    }
}
