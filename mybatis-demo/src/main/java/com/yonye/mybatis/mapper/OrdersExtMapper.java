package com.yonye.mybatis.mapper;

import com.yonye.mybatis.vo.OrdersExt;

import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/19 14:24
 * @Version:1.0
 * @deseription:
 **/
public interface OrdersExtMapper {

    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);

    List<OrdersExt> findOrdersExtMap(OrdersExt ordersExt);

    List<OrdersExt> findOrdersAndOrderDetail(OrdersExt ordersExt);

}
