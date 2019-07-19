package com.jqh.mapper;

import com.jqh.pojo.OrdersExt;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 09:22
 * @Description: 根据订单id查询订单信息
 */
public interface OrdersExtMapper {
    OrdersExt findOrdersExt(OrdersExt ordersExt);
}
