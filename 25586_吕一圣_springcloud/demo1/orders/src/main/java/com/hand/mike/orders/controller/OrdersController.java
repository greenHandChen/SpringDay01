package com.hand.mike.orders.controller;

import com.hand.mike.orders.service.OrdersService;
import com.hand.mike.provider.domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    /**
      * @Desc: 获取订单
      */
    @GetMapping(value = "/getOrder/{id}")
    public Orders getOrder(@PathVariable("id")Integer id){
        return ordersService.getOrder(id);
    }

    /**
      * @Desc: 删除订单
      */
    @GetMapping(value = "/deleteOrder/{id}")
    public Integer deleteOrder(@PathVariable("id") Integer id){
        return ordersService.deleteOrder(id);
    }

    /**
      * @Desc: 更新订单
      */
    @GetMapping(value = "/updateOrder")
    public Integer updateOrder(@RequestBody Orders order){
        return ordersService.updateOrder(order);
    }

    /**
      * @Desc: 添加订单
      */
    @PostMapping(value = "/addOrder")
    public Integer addOrder(@RequestBody Orders order){
        return ordersService.addOrder(order);
    }
}
