package com.hand.mapper;

import com.hand.entity.OrdersExt;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/19
 */
public interface OrdersMapper {

    //一对一之resultType
    List<OrdersExt> findOrdersAndUser();

    //一对一之resultMap
    List<OrdersExt> findOrdersAndUserResultMap();
}
