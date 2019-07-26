package club.osai.userservice.service.impl;

import club.osai.userservice.dao.UserDao;
import club.osai.userservice.po.User;
import club.osai.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserServiceImpl.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> list() {
        return userDao.findAll();
    }

    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public User getById(Long id) {
        Optional<User> byId = userDao.findById(id);
        boolean present = byId.isPresent();
        if (present) {
            return byId.get();
        }
        return null;
    }

    @Override
    public List<User> getByNameLike(String name) {

        return userDao.findByNameLike("%" + name + "%");
    }

    @Override
    public User getByName(String name) {
        return userDao.findByName(name);
    }
}
