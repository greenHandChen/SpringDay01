package com.hand.mapper;

import com.hand.entity.OrdersUsers;

import java.util.List;

public interface OrdersMapper {
    List<OrdersUsers> selectOrdersUsers(int id);
}
