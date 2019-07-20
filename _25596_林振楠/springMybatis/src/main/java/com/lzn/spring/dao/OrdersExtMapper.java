package com.lzn.spring.dao;

import com.lzn.spring.entity.OrdersExt;

import java.util.List;

public interface OrdersExtMapper {

    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
