package com.zt.eureka_producer_ext.service;

import com.zt.eureka_producer_ext.dto.Orders;

import java.util.List;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-26 16:14
 */
public interface IOrdersService {

    // 根据用户名查询用户订单
    List<Orders> getOrdersByName(String username);

    // 根据id查询订单
    Orders getOrdersById(Integer id);
}
