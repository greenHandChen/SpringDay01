package com.wzh.controller;

import com.wzh.pojo.User;
import com.wzh.pojo.UserInfo;
import com.wzh.service.UserService;
import com.wzh.service.UserInfoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserInfoFeign userInfoFeign;

    @RequestMapping("getUser/{id}")
    public User findUserById(@PathVariable("id") int id) {
        User user = userService.findUserById(id);
        UserInfo info = userInfoFeign.getUserInfoById(user.getId());
        user.setUserInfo(info);
        return user;
    }

}

