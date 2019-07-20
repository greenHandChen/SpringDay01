package com.itheima.mybatis.mapper;

import com.itheima.mybatis.po.OrdersExt;
import com.itheima.mybatis.po.User;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

public interface OrdersMapper {

    public List<User> findUserAndItemsRstMap();

}
