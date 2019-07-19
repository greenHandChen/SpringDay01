package com.jqh.mapper;

import com.jqh.pojo.OrdersExt2;

import java.util.List;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 10:04
 * @Description: 根据用户id查询订单及用户信息
 */
public interface OrdersExt2Mapper {
   List<OrdersExt2> findByUserId(Integer userId);
   List<OrdersExt2> findByUserIdLoad(Integer userId);
}