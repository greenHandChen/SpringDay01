package com.example.controller;

import com.example.dao.UserMapper;
import com.example.domain.Order;
import com.example.domain.User;
import com.example.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserOrderService userOrderService;

    @RequestMapping("/user/{uid}")
    public User getUserById(@PathVariable("uid") Integer uid) {
        return userMapper.getById(uid);
    }

    @RequestMapping("/user/getFeignOrder/{uid}")
    public List<Order> getUserOrder(@PathVariable("uid") Integer uid){
    return userOrderService.getOrderByUid(uid);
    }
}
