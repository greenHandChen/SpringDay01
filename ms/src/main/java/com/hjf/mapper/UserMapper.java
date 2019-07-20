package com.hjf.mapper;

import com.hjf.pojo.OrdersExt;
import com.hjf.pojo.User;

import java.util.List;

public interface UserMapper {
    User findUserById(Integer id);

    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
