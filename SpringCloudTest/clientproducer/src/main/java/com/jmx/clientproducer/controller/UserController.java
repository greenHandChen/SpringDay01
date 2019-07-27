package com.jmx.clientproducer.controller;

import com.jmx.clientproducer.model.UserDemo;
import com.jmx.clientproducer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:
 * @Date:created in
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/test")
    public String test(){
        System.out.println("正在调用UserController的test方法");
        return "hello spring cloud";
    }
    @RequestMapping(value="update/addUser")
    public String  insertUser(@RequestBody UserDemo userDemo){
              return userService.insertUser(userDemo);
    }

    @RequestMapping("query/queryUser")
    public String queryUser(){
        return userService.queryUser();
    }
    @RequestMapping("query/queryUserList")
    public List<UserDemo> queryUserList(){
           return userService.queryUserList();
    }
}
