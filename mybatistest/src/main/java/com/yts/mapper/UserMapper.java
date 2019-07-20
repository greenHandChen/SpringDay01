package com.yts.mapper;

import com.yts.beans.User;
import com.yts.beans.OrdersExt;

import java.util.List;

public interface UserMapper {
    User findUserById(int id);

    List<User> findUserByUsername(String username);

    int addUser(User user);

    OrdersExt findOrdersExt(OrdersExt ext);

    OrdersExt findOrderSByResultMap(OrdersExt ext);
}
