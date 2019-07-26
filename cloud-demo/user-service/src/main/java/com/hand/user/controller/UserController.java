package com.hand.user.controller;

import com.hand.user.domain.User;
import com.hand.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("find/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }

    @PostMapping("save")
    public int save(User user){
        return userService.save(user);
    }

    @GetMapping("delete/{id}")
    public int deleteById(@PathVariable Integer id){
        return userService.deleteById(id);
    }

    @PostMapping("update")
    public int updateById(User user){
        return userService.updateById(user);
    }

}
