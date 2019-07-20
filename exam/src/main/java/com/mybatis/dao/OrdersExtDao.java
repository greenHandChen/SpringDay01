package com.mybatis.dao;

import com.mybatis.pojo.OrdersExt;

import java.util.List;

public interface OrdersExtDao {

    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
