package com.jqh.mapper;

import com.jqh.pojo.OrdersExt;

import java.util.List;

/**
 * @Auther: 几米
 * @Date: 2019/7/20 15:21
 * @Description: OrdersMapper
 */
public interface OrdersMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
