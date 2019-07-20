package com.hand.dao;

import com.hand.pojo.OrdersExt;

import java.util.List;

/**
 * @Author: 王俊
 * @Date: 2019/7/20 15:14
 **/
public interface OrdersDao {
    List<OrdersExt> findOrderExts(OrdersExt ordersExt);
}
