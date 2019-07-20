package com.hand.lq.dao;

import com.hand.lq.pojo.OrdersExt;

import java.util.List;

public interface OrderMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
