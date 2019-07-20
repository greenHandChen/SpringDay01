package com.mapper;

import com.domain.OrdersExt;
import com.domain.User;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/20.
 */
public interface OrdersExtMapper {
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
    User findUserById(Integer id);
}
