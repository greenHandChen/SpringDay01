package com.txz.mybatis.mapper;

import com.txz.mybatis.domain.OrdersExt;

import java.util.List;

public interface OrdersMapper {

    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
