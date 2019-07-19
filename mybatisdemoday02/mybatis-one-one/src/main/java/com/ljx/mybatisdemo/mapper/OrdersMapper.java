package com.ljx.mybatisdemo.mapper;

import com.ljx.mybatisdemo.po.OrdersExt;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 9:43
 */
public interface OrdersMapper {
    //一对一之resultType
    List<OrdersExt> findOrdersAndUser();

    //一对一之resultMap
    List<OrdersExt> findOrdersAndUserRstMap();
}
