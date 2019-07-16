package com.hand.controller;

import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void hello(){
        System.out.println("userController 收到 hello");
        userService.hello();
        System.out.println("userController 返回hi");
    }
}
