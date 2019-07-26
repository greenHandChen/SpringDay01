package com.lx.eurekaclient.controller;

import com.lx.eurekaclient.domain.User;
import com.lx.eurekaclient.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/select")
    public String select(Integer id){
        return userService.findUserById(id).toString();
    }
}
