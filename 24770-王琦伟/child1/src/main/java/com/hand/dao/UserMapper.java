package com.hand.dao;

import com.hand.vo.OrdersExt;

import java.util.List;

public interface UserMapper {

    List<OrdersExt> findUserByid(Integer id);
}
