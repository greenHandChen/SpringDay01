package com.hand.mybatis.mapper;

import com.hand.mybatis.po.OrdersCustom;

import java.util.List;

/**
 * @Author xiongyilin
 * @Date 2019/7/19 10:55
 * @Version 1.0
 */

public interface OrdersMapperCustom {
    public List<OrdersCustom> findOrdersUser() throws Exception;
}
