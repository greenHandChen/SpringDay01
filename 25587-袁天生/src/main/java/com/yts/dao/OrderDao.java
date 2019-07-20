package com.yts.dao;

import com.yts.beans.OrdersExt;

import java.util.List;

public interface OrderDao {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);

}
