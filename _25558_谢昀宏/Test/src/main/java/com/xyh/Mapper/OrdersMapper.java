package com.xyh.Mapper;

import com.xyh.Entity.OrdersExts;

import java.util.List;

public interface OrdersMapper {

    List<OrdersExts> findOrdersExts(OrdersExts ordersExts);
}
