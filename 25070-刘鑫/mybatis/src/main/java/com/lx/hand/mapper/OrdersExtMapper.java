package com.lx.hand.mapper;

import com.lx.hand.domain.OrdersExt;

import java.util.List;

public interface OrdersExtMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
