package com.springcloud.eurekaclient.controller;

import com.springcloud.eurekaclient.bean.User;
import com.springcloud.eurekaclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CRUDController {

    @Autowired
    private UserService userService;

    @GetMapping("/sel/{id}")
    public Map<String, User> select(@PathVariable Integer id){
        Map<String, User> map = new HashMap<>();
        map.put("user", userService.getUserById(id));
        return map;
    }

    @GetMapping("/del/{id}")
    public String delete(@PathVariable Integer id){
        userService.deleteUserById(id);
        return "delete success";
    }

    @PostMapping("/upd")
    public String update(@RequestBody User user){
        System.out.println("client controller:"+user);
        userService.updateUser(user);
        return "update success";
    }

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        System.out.println("client controller:"+user);
        userService.addUser(user);
        return "add success";
    }

}
