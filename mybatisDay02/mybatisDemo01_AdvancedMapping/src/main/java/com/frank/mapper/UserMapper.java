package com.frank.mapper;

import com.frank.pojo.Order;
import com.frank.pojo.OrderUser;
import com.frank.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 查找订单表以及订单表对应的用户名和用户地址
     * @return
     */
    List<OrderUser> findOrdersAndUser(OrderUser orderUser);

    /**
     * 使用ResultMap实现一对一关联查询
     */
    List<Order> findOrdersAndUserByResultMap(Order order);

    /**
     * 一对多关联查询
     */
    List<Order> ordersAndOrderDetailsResultMap(Order order);
}
