package com.hand.controller;


import com.hand.entity.User;
import com.hand.entity.UserInfo;
import com.hand.feign.UserInfoService;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/list")
    public List<User> list() {

        List<User> userList = userService.userList();

        userList.forEach(user -> {

            UserInfo userInfo = userInfoService.getUserInfoById(user.getUserInfoId());

            user.setInfoa(userInfo.getInfoa());
            user.setInfob(userInfo.getInfob());

        });

        return userList;

    }

    @RequestMapping("/get/{id}")
    public String getUserById(@PathVariable("id") Integer id) {

        return userService.getUserById(id).toString();

    }

}
