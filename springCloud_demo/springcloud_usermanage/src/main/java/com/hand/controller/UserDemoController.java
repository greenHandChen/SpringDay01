package com.hand.controller;

import com.hand.pojo.Orders;
import com.hand.pojo.UserDemo;
import com.hand.service.OrdersService;
import com.hand.service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dingwensheng
 * @description: TODO
 * @date 2019/7/2314:58
 */
@Controller
public class UserDemoController {

    @Autowired
    private UserDemoService userDemoService;
    @Autowired
    private OrdersService ordersService;

    /*
    本地服务
     */
    @ResponseBody
    @RequestMapping("/queryUsers")
    public List<UserDemo> queryUserDemos(){
        return  userDemoService.queryUserDemos();
    }

    /*
    调用extramanager服务
     */
    @ResponseBody
    @RequestMapping("/feign/queryOrders")
    public List<Orders> findOrders(){
        return ordersService.finOrders();
    }
}
