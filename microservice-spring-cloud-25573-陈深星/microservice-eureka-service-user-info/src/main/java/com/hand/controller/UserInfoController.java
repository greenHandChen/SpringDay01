package com.hand.controller;

import com.hand.entity.UserInfo;
import com.hand.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/user-info")
public class UserInfoController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @RequestMapping("/list")
    public List<UserInfo> list() {

        return userInfoRepository.findAll();

    }


    ///
    @RequestMapping("/one/{id}")
    public UserInfo getUserInfoById(@PathVariable("id") Integer id) {

        return userInfoRepository.getOne(id);

    }
}
