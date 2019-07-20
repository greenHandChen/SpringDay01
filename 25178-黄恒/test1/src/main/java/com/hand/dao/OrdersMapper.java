package com.hand.dao;

import com.hand.entity.OrdersExt;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/20
 */
public interface OrdersMapper {

    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);

}
