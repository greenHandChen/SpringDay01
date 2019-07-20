package com.hand.mapper;

import com.hand.domain.OrdersExt;
import com.hand.domain.User;

import java.util.List;

public interface UserMapper {
    User findUserById(Integer id);
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
