package com.hand.mapper;

import com.hand.entity.OrdersExt;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

    //通过resultType查询，关联用户信息
    OrdersExt findOrderExt(OrdersExt ordersExt);

    //通过resultMap查询，关联用户信息
    OrdersExt findOrderExtByRstMap(@Param("id") int id);

    //通过resultMap查询，关联订单详情信息
    OrdersExt findOrdersAndOrderDetail(@Param("id") int id);
}
