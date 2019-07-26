package com.user.controller;

import com.user.client.MessageClient;
import com.user.domain.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wangjie_fourth on 2019/7/26.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MessageClient messageClient;

    @GetMapping("/get/{id}")
    @ResponseBody
    public User getUser(@PathVariable Integer id){
        // 调用Message服务
        String result = messageClient.getMessage();
        System.out.println(result);
        User user = userService.getUser(id);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(
            @PathVariable  Integer id
    ){
        userService.deleteUserById(id);
    }

    @PostMapping("/updateUser")
    public void updateUser(
            @RequestBody User user
    ){
        userService.updateUser(user);
    }

    @PostMapping("/insertUser")
    public void insertUser(
            @RequestBody  User user){
        userService.insertUser(user);
    }


}
