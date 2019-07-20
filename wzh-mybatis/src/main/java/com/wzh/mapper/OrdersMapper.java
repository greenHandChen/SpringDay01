package com.wzh.mapper;

import com.wzh.domain.Orders;
import com.wzh.domain.User;

import java.util.List;


public interface OrdersMapper {
    Orders findOrdersById(int id);
    List<Integer> queryOrdersByUserId(int user_id);
}
