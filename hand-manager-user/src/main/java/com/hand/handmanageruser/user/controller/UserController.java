package com.hand.handmanageruser.user.controller;

import com.hand.handmanageruser.user.entity.User;
import com.hand.handmanageruser.user.entity.UserDetail;
import com.hand.handmanageruser.user.feign.UserDetailFeignClient;
import com.hand.handmanageruser.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: spring-cloud-exercise
 * @Description: TODO
 * @date 2019/7/26 14:54
 */
@RestController
//@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private UserDetailFeignClient userDetailFeignClient;
    @GetMapping("/hello1")
    public String hello(){
        return "helloUser";
    }


    @GetMapping("/find/detail/{userId}")
    public UserDetail findUserDetailByUserId(@PathVariable Long userId){
        return this.userDetailFeignClient.findUserDetailByUserId(userId);
    }

    @GetMapping("/adduser")
    public String addUser(User user){
        Long flag = userService.addUser(user);
        if(flag > 0){
            return "success";
        }else {
            return "add user fail";
        }
    }

    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @GetMapping("/find/{userId}")
    public User findUserById(@PathVariable Long userId){
        return userService.findUserById(userId);
    }

    @GetMapping("/del/{userId}")
    public String delUserById(@PathVariable Long userId){
        Long flag = userService.delUserById(userId);
        if(flag > 0 ){
            return "delete user success";
        }else{
            return "delete user fail";
        }
    }


}
