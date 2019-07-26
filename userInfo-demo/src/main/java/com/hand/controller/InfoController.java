package com.hand.controller;

import com.hand.service.UserInfoService;
import com.hand.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/getUserInfo/{id}")
    public UserInfo getUserInfoById(@PathVariable("id") int id) {

        UserInfo userInfo = userInfoService.getUserInfo(id);
        System.out.println(userInfo);
        return userInfo;
    }
}
