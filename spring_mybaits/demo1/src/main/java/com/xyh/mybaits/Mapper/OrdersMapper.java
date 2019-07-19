package com.xyh.mybaits.Mapper;

import com.xyh.mybaits.Entity.Orders;
import com.xyh.mybaits.Entity.OrdersExt;
import com.xyh.mybaits.Entity.User;

import java.util.List;

public interface OrdersMapper {

    List<OrdersExt> findOrdersAndUser();

    List<OrdersExt> findOrdersAndUserRstMap();

    List<OrdersExt> findOrdersAndDetailRstMap();

    List<User> findUserAndItemsRstMap();

    List<OrdersExt> findOrderAndUserLazyLoading();
}
