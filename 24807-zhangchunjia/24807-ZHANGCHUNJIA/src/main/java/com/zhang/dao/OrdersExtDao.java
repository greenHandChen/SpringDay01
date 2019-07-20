package com.zhang.dao;

import com.zhang.entity.OrdersExt;

import java.util.List;

public interface OrdersExtDao {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
