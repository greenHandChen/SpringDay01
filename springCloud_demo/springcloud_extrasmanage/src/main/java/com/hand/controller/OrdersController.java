package com.hand.controller;

import com.hand.pojo.Orders;
import com.hand.pojo.UserDemo;
import com.hand.service.OrdersService;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dingwensheng
 * @description: TODO
 * @date 2019/7/2610:42
 */
@Controller
public class OrdersController {

    @Autowired
    private OrdersService ordersService;
    @Autowired
    private UserService userService;

    /*
    本地服务
     */
    @ResponseBody
    @RequestMapping("/queryOrders")
    public List<Orders> finOrders(){
        return ordersService.queryUserOrders();
    }

    /*
    调用Usermanager服务
     */
    @ResponseBody
    @RequestMapping("/feign/queryUsers")
    public List<UserDemo> queryUsers(){
        return userService.queryUserDemos();
    }

}
