package com.hand.controller;

import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


    @Autowired
    private UserService userService;


//    @Autowired
//    public void setUserService(UserService userService)
//    {
//        this.userService = userService;
//    }

    public void addUser ()
    {
        System.out.println("准备添加用户");
        userService.addUser();
    }
}
