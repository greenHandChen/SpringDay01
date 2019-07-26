package com.hand.mike.provider.controller;

import com.hand.mike.provider.domain.Orders;
import com.hand.mike.provider.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    /**
      * @Desc: 获取
      */
    @GetMapping(value = "/getOrder/{id}")
    public Orders getOrder(@PathVariable("id")Integer id){

        return ordersService.getOrderById(id);
    }

    /**
      * @Desc: 添加
      */
    @PostMapping(value = "/addOrder")
    public Integer addOrder(@RequestBody Orders order){

        return ordersService.addOrder(order);
    }

    /**
      * @Desc: 删除
      */
    @GetMapping(value = "/deleteOrder/{id}")
    public Integer deleteOrder(@PathVariable("id")Integer id){
        return ordersService.deleteOrderById(id);
    }

    /**
      * @Desc: 更新
      */
    @GetMapping(value = "/update")
    public Integer updateOrder(@RequestParam("order")Orders order){
        return ordersService.updateOrder(order);
    }
}
