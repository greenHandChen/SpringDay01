package com.spring.mapper;

import com.spring.domain.OrdersExt;

import java.util.List;

public interface OrdersMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
