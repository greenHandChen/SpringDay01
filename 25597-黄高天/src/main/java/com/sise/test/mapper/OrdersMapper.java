package com.sise.test.mapper;

import com.sise.test.po.OrdersExt;
import com.sise.test.po.User;

import java.util.List;

public interface OrdersMapper {

    public List<User> findOrdersExts();

}
