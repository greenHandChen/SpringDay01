package com.cloud.user.controller;

import com.cloud.user.client.CommentClient;
import com.cloud.user.entity.User;
import com.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private CommentClient commentClient;

    @GetMapping("/findUser")
    public User findById(@RequestParam Integer id){
        return userService.findById(id);
    }

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/addUser")
    public Integer addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/updateUser")
    public Integer updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser")
    public Integer deleteUser(@RequestParam Integer id){
        return userService.deleteUser(id);
    }

    @GetMapping("/findComment")
    public String findComment(@RequestParam Integer userId){
        int id = userService.findById(userId).getCommentId();
        return commentClient.findById(id);
    }
}
