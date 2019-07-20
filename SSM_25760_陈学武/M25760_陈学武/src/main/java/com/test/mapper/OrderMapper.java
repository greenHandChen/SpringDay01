package com.test.mapper;

import com.test.pojo.OrdersExt;

import java.util.List;

public interface OrderMapper {
    List<OrdersExt> finOrdersExts(OrdersExt ordersExt);
}
