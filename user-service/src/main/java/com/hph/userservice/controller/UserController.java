package com.hph.userservice.controller;

import com.hph.userservice.dao.UserDao;
import com.hph.userservice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/findUserById")
    public User findUserById(Integer id) {
        return userDao.findById(id).get();
    }

    @PostMapping("/addUser")
    public User addUser(User user) {
        return userDao.save(user);
    }

    @PostMapping("/updateUser")
    public User updateUser(User user) {
        return userDao.save(user);
    }

    @GetMapping("/deleteUser")
    public String deleteUser(Integer id) {
        userDao.deleteById(id);
        return "OK";
    }

}
