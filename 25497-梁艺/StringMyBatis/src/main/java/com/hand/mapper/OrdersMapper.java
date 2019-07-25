package com.hand.mapper;

import com.hand.entity.exts.OrderExts;
import com.hand.entity.exts.QueryOrder;

import java.util.List;

public interface OrdersMapper {
    /**
     * 查询订单信息
     * @param queryOrder
     * @return
     */
    public List<OrderExts> findOrderExts(QueryOrder queryOrder);
}