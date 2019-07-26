package com.hand.mike.orders.service;

import com.hand.mike.provider.domain.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@FeignClient(value = "provider")
public interface OrdersService {

    /**
      * @Desc: 获取订单
      */
    @RequestMapping(value = "/getOrder/{id}",method = RequestMethod.GET)
    Orders getOrder(@PathVariable("id")Integer id);

    /**
      * @Desc: 删除订单
      */
    @RequestMapping(value = "/deleteOrder/{id}")
    Integer deleteOrder(@PathVariable("id")Integer id);

    /**
      * @Desc: 添加订单
      */
    @PostMapping(value = "/addOrder")
    Integer addOrder(@RequestBody Orders order);

    /**
      * @Desc: 更新订单
      */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    Integer updateOrder(@RequestBody Orders order);
}
