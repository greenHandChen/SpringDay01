package com.ct.mapper;


import com.ct.domain.OrdersExt;

import java.util.List;

public interface OrdersExtMapper {
    /**
     * 根据查询条件查询订单明细数据
     * @param ordersExt 查询条件
     * @return 订单明细数据
     */
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
