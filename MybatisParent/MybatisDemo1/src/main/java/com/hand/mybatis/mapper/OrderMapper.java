package com.hand.mybatis.mapper;

import com.hand.mybatis.pojo.Order;

import java.util.List;

public interface OrderMapper {

    List<Order> slectOrderList();

    List<Order> selectOrderByUserId();


}
