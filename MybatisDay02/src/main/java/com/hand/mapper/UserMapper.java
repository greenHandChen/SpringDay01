package com.hand.mapper;

import com.hand.domin.OrdersExt;

import java.util.List;

public interface UserMapper {
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);
    List<OrdersExt> findOrderAndOrderDetail(OrdersExt ordersExt);
    List<OrdersExt> findOrderInfoByLazyLoad(Integer id);
}
