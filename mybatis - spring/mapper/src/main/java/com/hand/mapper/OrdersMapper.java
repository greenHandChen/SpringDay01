package com.hand.mapper;

import com.hand.ext.OrdersExt;
/**
*@Description 订单表接口
*@Author yunfeng.ye
*@Date 2019/7/19
*@Time 19:51
*/
public interface OrdersMapper {
/**
*@Description 订单表和用户表联合查询
*@Param 订单拓展类
*@Return 订单拓展类
*@Author yunfeng.ye
*@Date 2019/7/19
*@Time 19:52
*/
    public OrdersExt findOrdersExt(OrdersExt ordersExt);
}
