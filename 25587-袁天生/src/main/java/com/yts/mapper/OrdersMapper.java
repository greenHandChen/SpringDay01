package com.yts.mapper;

import com.yts.beans.OrdersExt;

import java.util.List;

public interface OrdersMapper {

    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
