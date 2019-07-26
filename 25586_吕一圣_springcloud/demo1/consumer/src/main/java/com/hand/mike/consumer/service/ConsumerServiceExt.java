package com.hand.mike.consumer.service;

import com.hand.mike.provider.domain.Orders;
import com.hand.mike.provider.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@FeignClient(value = "orders")
public interface ConsumerServiceExt {

    @RequestMapping(value = "/getOrder/{id}",method = RequestMethod.GET)
    Orders getOrder(@PathVariable("id")Integer id);

    @PostMapping(value = "/addOrder")
    Integer addOrder(@RequestBody Orders order);

    @RequestMapping(value = "/deleteOrder/{id}",method = RequestMethod.GET)
    Integer deleteOrder(@PathVariable("id") Integer id);

    @RequestMapping(value = "/updateOrder",method = RequestMethod.POST)
    Integer updateOrder(@RequestBody Orders order);

}
