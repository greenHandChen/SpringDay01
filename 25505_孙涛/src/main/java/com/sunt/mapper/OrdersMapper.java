package com.sunt.mapper;

import com.sunt.po.OrdersExt;

import java.util.List;

public interface OrdersMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
