package com.ljx.ssm.mapper;

import com.ljx.ssm.po.OrdersExt;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/20
 * @Time 15:26
 */
public interface OrdersMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
