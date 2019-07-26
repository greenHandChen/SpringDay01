package com.example.springcloudconsulclient.controller;

import com.example.springcloudconsulclient.bean.Orders;
import com.example.springcloudconsulclient.bean.User;
import com.example.springcloudconsulclient.mapper.UserMapper;
import com.example.springcloudconsulclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    private FeignService feignService;

    @Autowired
    private UserMapper userMapper;
    @GetMapping(value = "/query")
    public List<User> findUserById(@RequestParam Integer id){
        List<User> userById = userMapper.findUserById(id);
        Orders order=new Orders();
        for (User user: userById
             ) {
            order.setUserId(user.getId());
            System.out.println("----"+order.getUserId());
            List<Orders> orders = feignService.findUserOtherInfo(order);
            user.setOrders(orders);
        }

        return userById;
    }

    @GetMapping("/test")
    public String test(@RequestParam(value = "message") String message){
        return "test4"+message;
    }

    @PostMapping(value = "/querybyuser")
    public List<User> findUserByUser(User user){
        List<User> userByUser = userMapper.findUserByUser(user);
        for (User users:userByUser
             ) {
            System.out.println(users);
        }
        return userByUser;
    }

    @PostMapping(value = "/deleteUserInfo")
    public boolean deleteUserInfo(User user){
        Integer info = userMapper.deleteUserInfo(user);
        return info>0;
    }

    @PostMapping("/insertUserInfo")
    public boolean insertUserInfo(User user){
        Integer info = userMapper.insertUserInfo(user);
        return info>0;
    }

    @PostMapping(value = "/updateUserInfo")
    public boolean updateUserInfo(User user){
        Integer info = userMapper.updateUserInfo(user);
        return info>0;
    }


}