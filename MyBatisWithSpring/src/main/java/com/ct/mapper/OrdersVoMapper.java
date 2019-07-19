package com.ct.mapper;

import com.ct.domain.OrdersVo;

public interface OrdersVoMapper {
    /**
     * 根据订单id查询订单信息，测试嵌套查询结果映射
     * @param id 订单id
     * @return 订单用户信息
     */
    OrdersVo findOrdersVoById(Integer id);
    /**
     * 根据订单id查询订单信息，测试关联查询结果映射
     * @param id 订单id
     * @return 订单用户信息
     */
    OrdersVo findOrdersVoByIdEx(Integer id);
}
