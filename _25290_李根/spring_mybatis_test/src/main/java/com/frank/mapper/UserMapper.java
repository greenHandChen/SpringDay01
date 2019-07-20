package com.frank.mapper;

import com.frank.pojo.Order;
import com.frank.pojo.OrderExt;
import com.frank.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 根据OrderExt查询订单列表
     * @param orderExt
     * @return
     */
     List<OrderExt> findOrderExts(OrderExt orderExt);
}
