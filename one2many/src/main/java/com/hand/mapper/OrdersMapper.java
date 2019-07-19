package com.hand.mapper;

import com.hand.entity.OrdersExt;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/19
 */
public interface OrdersMapper {

    List<OrdersExt> findOrderAndDetailResultMap();
}
