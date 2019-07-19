package com.mybatis.dao;

import com.mybatis.pojo.OrdersExt;

import java.util.List;

public interface OrdersExtDao {
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);
    List<OrdersExt> findOrdersByRstMap(OrdersExt ordersExt);
    List<OrdersExt> findOrdersAndOrderDetail(OrdersExt ordersExt);
    List<OrdersExt> findOrderInfoByLazyLoad(Integer id);
}
