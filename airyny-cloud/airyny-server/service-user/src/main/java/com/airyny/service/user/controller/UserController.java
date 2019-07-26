package com.airyny.service.user.controller;

import com.airyny.service.user.model.User;
import com.airyny.service.user.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/26 10:22
 * @Version:1.0
 * @deseription:
 **/
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        List<User> list=new ArrayList<>();
        list=userService.selectAll();
        return list;
    }

    @RequestMapping("/selectUser/{id}")
    public User selectUser(@PathVariable("id") Integer id){
        User user =new User();
        user=userService.select(id);
        return user;
    }
}
