package com.hand.service.impl;

import com.hand.entity.exts.OrderExts;
import com.hand.entity.exts.QueryOrder;
import com.hand.mapper.OrdersMapper;
import com.hand.service.IOrderService;

import java.util.List;

public class OrdersServiceImpl implements IOrderService {

    private OrdersMapper ordersMapper;

    public void setOrdersMapper(OrdersMapper ordersMapper) {
        this.ordersMapper = ordersMapper;
    }

    public List<OrderExts> findOrderExts(QueryOrder queryOrder) {

        return ordersMapper.findOrderExts(queryOrder);
    }
}
