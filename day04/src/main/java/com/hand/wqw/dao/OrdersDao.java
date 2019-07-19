package com.hand.wqw.dao;

import com.hand.wqw.vo.OrderExt;

import java.util.List;

public interface OrdersDao {
    List<OrderExt> findOrderExts(OrderExt orderExt);
    OrderExt findOrderExtsLazyLoad(Integer id);
}
