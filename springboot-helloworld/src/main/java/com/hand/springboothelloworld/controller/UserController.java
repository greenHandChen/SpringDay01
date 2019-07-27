package com.hand.springboothelloworld.controller;

import com.hand.springboothelloworld.dao.UserMapper;
import com.hand.springboothelloworld.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/22 16:34
 */
@RestController
@RequestMapping("/user/*")
public class UserController {
    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;

    @GetMapping("list")
    public List<User> getList(){
        return userMapper.listSample();
    }

    @GetMapping("list/{username}")
    public List<User> findUserByName(@PathVariable("username") String username){
        return userMapper.findbyUsername(username);
    }

    @GetMapping("get/{username}/{password}")
    public User getUser(@PathVariable("username") String username ,@PathVariable("password") String password){
        return userMapper.getBadUser(username,password);
    }
}
