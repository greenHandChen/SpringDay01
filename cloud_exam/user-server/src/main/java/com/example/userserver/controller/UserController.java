package com.example.userserver.controller;

import com.example.userserver.po.User;
import com.example.userserver.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/insert")
    public String insert(@RequestBody User user){
        int i = userService.insertSelective(user);
        return String.valueOf(i);
    }

    @RequestMapping("/select")
    public String select(@RequestBody User user){
        List<User> users = userService.selectByUser(user);
        return Arrays.asList(users).toString();
    }

    @RequestMapping("/del")
    public String del(@RequestParam int[] ids ){
        int i = userService.deleteByPrimaryKeys(ids);
        return String.valueOf(i);
    }

    @RequestMapping("/update")
    public String update(@RequestBody User user){
        int i = userService.updateByPrimaryKeySelective(user);
        return String.valueOf(i);
    }

}
