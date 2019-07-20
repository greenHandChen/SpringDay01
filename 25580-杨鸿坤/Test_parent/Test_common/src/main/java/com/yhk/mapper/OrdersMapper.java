package com.yhk.mapper;

import com.yhk.pojo.OrdersExt;

import java.util.List;

public interface OrdersMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
