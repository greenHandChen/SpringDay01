package com.airyny.service.userInfo.controller;

import com.airyny.service.userInfo.mapper.UserInfoMapper;
import com.airyny.service.userInfo.model.User;
import com.airyny.service.userInfo.model.UserInfo;
import com.airyny.service.userInfo.model.UserVo;
import com.airyny.service.userInfo.server.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/26 11:16
 * @Version:1.0
 * @deseription:
 **/
@RestController
public class UserInfoController {
    @Autowired
    private UserFeign userFeign;
    @Autowired
    private UserInfoMapper userInfoMapper;


    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        List<User> list=new ArrayList<>();
        list=userFeign.getAllUser();
        return list;
    }


    @RequestMapping("/selectUser/{id}")
    public UserVo selectUser(@PathVariable("id") Integer id){
        User user=new User();
        user=userFeign.selectUser(1);
        UserInfo userInfo=new UserInfo();
        userInfo=userInfoMapper.selectByUserId(1);
        UserVo userVo=new UserVo();
        userVo.setUser(user);
        userVo.setUserInfo(userInfo);
        return userVo;
    }

}
