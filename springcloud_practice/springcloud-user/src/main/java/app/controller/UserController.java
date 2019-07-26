package app.controller;

import app.service.UserMoreService;
import entity.User;
import entity.UserMore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.service.UserService;

/**
 * @author: wuhui
 * @time: 2019/7/26 18:15
 * @desc:
 */
@RestController
public class UserController {
    @Autowired
    UserService service;
    @Autowired
    UserMoreService userMoreService;

    @GetMapping(value = "/userMore/{id}")
    public UserMore selectUserMoreById(@PathVariable("id") Integer id){
        return  userMoreService.selectUserMoreById(id);
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }
    @DeleteMapping(value = "/user/{id}")
    public void deleteUserById(@PathVariable("id") Integer id){
        service.deleteUserById(id);
    }
    @PutMapping(value = "/user")
    public void deleteUserById(@RequestBody User user){
        service.updateUser(user);
    }
    @GetMapping(value = "/user/{id}")
    public User selectUserById(@PathVariable("id") Integer id){
        return  service.selectUserById(id);
    }
}
