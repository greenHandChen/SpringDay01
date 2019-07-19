package com.hand.smybatis.mapper;

import com.hand.smybatis.pojo.Order;

import java.util.List;

public interface OrderMapper {

    List<Order> selectOrderList();

    List<Order> selectOrderByUserId();


}
