package com.sise.test.mapper;

import com.sise.test.po.OrdersExt;

import java.util.List;

public interface UserMapper {
    public List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
