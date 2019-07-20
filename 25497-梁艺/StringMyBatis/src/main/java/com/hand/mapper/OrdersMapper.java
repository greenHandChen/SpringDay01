package com.hand.mapper;

import com.hand.entity.OrdersUser;

import java.util.List;

public interface OrdersMapper {
    /**
     * 查询订单对应的用户
     * @param user_id
     * @return
     */
    public List<OrdersUser> selectOrdersAndUser(int user_id);
}