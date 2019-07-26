package com.masirhh.userprovider.controller;

import com.masirhh.userprovider.beans.User;
import com.masirhh.userprovider.beans.UserExt;
import com.masirhh.userprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable("id") Integer id){
        return userService.findUserById(id);
    }

    @PostMapping("/user")
    public void addUser(User user){
        userService.addUser(user);
    }

    @PutMapping("/user")
    public void updateUser(User user){
        Integer id=user.getId();
        User user1=userService.findUserById(id);
        user1.setUsername(user.getUsername());
        user1.setCountryid(user.getCountryid());
        userService.updateUser(user1);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
    }

    @GetMapping("/user/userext/{id}")
    public UserExt findUserExt(@PathVariable("id") Integer id)
    {
        return  userService.findUserExt(id);
    }

}
