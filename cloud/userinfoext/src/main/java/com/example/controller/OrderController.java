package com.example.controller;

import com.example.dao.OrderMapper;
import com.example.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;
    @RequestMapping("/getOrder/{uid}")
    public List<Order> getOrderByUid(@PathVariable("uid") Integer uid){
        return orderMapper.getByUserId(uid);
    }
    @RequestMapping("/addOrder/")
    public Integer addOrder( Order order){
        return orderMapper.addOrder(order);
    }
}
