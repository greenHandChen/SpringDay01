package com.hand.lq.service;

import com.hand.lq.pojo.OrdersExt;

import java.util.List;

public interface OrderService {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
