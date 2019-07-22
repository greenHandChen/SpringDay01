package com.hand.spring_boot_day1.controller;

import com.hand.spring_boot_day1.entity.Orders;
import com.hand.spring_boot_day1.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ConfigurationProperties(prefix="hero")
public class UserController {
    @Autowired
    private OrderMapper ordermapper;


    @ResponseBody
    @RequestMapping("/mybatis")
    public List<Orders> testMybatis(){
        List<Orders> all = ordermapper.findAll();
        return all;
    }
}
