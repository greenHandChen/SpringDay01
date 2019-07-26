package com.zt.eureka_producer_ext.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zt.eureka_producer_ext.dto.Orders;
import com.zt.eureka_producer_ext.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-26 10:44
 */
@RestController
public class ExtController {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private IOrdersService ordersService;

    @GetMapping("/eorders")
    public String getOrdersByName(@RequestParam(name = "username", required = true, defaultValue = "invoker") String username) throws JsonProcessingException {
        /**
         * @description: 根据用户名模糊查询用户订单
         * @author: invokerZt
         * @date: 2019-07-26 10:55
         * @param username: 用户名
         * @return: java.lang.String
         */
        return objectMapper.writeValueAsString(ordersService.getOrdersByName(username));
    }

    @GetMapping("/eorders/{id}")
    public String getOrdersById(@PathVariable String id) throws JsonProcessingException {
        /**
         * @description: 根据订单编号修改订单
         * @author: invokerZt
         * @date: 2019-07-26 10:58
         * @param id: 订单编号
         * @return: java.lang.String
         */
        return objectMapper.writeValueAsString(ordersService.getOrdersById(Integer.valueOf(id)));
    }

}
