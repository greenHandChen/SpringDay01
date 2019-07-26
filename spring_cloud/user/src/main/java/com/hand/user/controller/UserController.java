package com.hand.user.controller;

import com.hand.user.entity.User;
import com.hand.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author:Ervin
 * @date:2019/7/26
 * @description:
 **/

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/allUser")
    public List<User> allUser(){
        return userService.findAll();
    }

}
