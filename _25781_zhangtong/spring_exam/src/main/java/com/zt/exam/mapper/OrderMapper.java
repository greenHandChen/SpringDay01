package com.zt.exam.mapper;

import com.zt.exam.domain.OrdersExt;

import java.util.List;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-20 15:07
 */
public interface OrderMapper {

    /**
     * @description: 根据查询条件查询订单明细数据。
     * @author: invokerZt
     * @date: 2019-07-20 15:10
     * @param null:
     * @return:
     */
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
