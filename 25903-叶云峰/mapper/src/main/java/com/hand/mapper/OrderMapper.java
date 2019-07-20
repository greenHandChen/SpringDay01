package com.hand.mapper;

import com.hand.Ext.OrdersExt;

import java.util.List;

/**
*@Description 订单Mapper
*@Author yunfeng.ye
*@Date 2019/7/20
*@Time 15:35
*/
public interface OrderMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
