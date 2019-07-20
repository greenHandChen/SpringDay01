package com.hand.dao;

import com.hand.bean.OrdersExt;

import java.util.List;

public interface OrdersExtDao {

    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);

}
