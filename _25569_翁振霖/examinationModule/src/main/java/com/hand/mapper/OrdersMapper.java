package com.hand.mapper;

import com.hand.entity.OrdersExt;

import java.util.List;

public interface OrdersMapper {

    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
