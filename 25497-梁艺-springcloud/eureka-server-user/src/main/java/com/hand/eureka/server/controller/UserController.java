package com.hand.eureka.server.controller;

import com.hand.eureka.server.bean.User;
import com.hand.eureka.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/allUser")
    public List<User> allUser() {
        return userService.getAllList();
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public int deleteUser(Integer id) {
        return userService.deleteById(id);
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public int insert(@RequestBody User user){
        System.out.println("server-controller:"+user);
        return userService.insert(user);
    }
}
