package com.hand.service;

import com.hand.entity.exts.OrderExts;
import com.hand.entity.exts.QueryOrder;

import java.util.List;

public interface IOrderService {
    public List<OrderExts> findOrderExts(QueryOrder queryOrder);
}
