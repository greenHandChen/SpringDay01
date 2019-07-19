package com.hand.service;

import com.hand.entity.OrdersUser;

import java.util.List;

public interface IOrderService {
    public List<OrdersUser> getOrderAndUser(int user_id);
}