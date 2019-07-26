package com.hand.mike.provider.controller;

import com.hand.mike.provider.domain.User;
import com.hand.mike.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
      * @Desc: 获取
      */
    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable("id")Integer id){
        User user = userService.findUserById(id);
        return user;
    }

    /**
      * @Desc: 删除
      */
    @GetMapping(value = "/deleteUser/{id}")
    public Integer deleteUser(@PathVariable("id")Integer id){
        return userService.deleteUserById(id);
    }

    /**
      * @Desc: 更新
      */
    @GetMapping(value = "/updateUser")
    public Integer updateUser(@RequestBody User user){
        return userService.updateUserById(user);
    }

    /**
      * @Desc: 添加
      */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public Integer addUser(@RequestBody User user){
        System.out.println(user.toString());
        return userService.addUser(user);
    }
}
