package com.hjf.controller;

import com.hjf.pojo.User;
import com.hjf.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:UserController
 * Author:Hejunfeng
 * Date:2019/7/26 14:34
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/queryUser")
    public List<User> queryUser(){
        return userService.queryUser();
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public Integer deleteUser(@RequestParam("id") Integer id){
        return userService.deleteUser(id);
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public boolean updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}