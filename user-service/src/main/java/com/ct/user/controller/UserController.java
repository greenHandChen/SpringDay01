package com.ct.user.controller;

import com.ct.user.domain.User;
import com.ct.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ct478
 * @date 2019/7/26 0026
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user) {
        userMapper.add(user);
        return "add success";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        Integer rows = userMapper.delete(id);
        return "delete success, affected " + rows + " rows";
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<User> query(User user) {
        return userMapper.query(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user) {
        Integer rows = userMapper.update(user);
        return "update success, affected " + rows + " rows";
    }
}
