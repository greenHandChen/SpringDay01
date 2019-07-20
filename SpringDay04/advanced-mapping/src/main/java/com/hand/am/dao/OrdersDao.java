package com.hand.am.dao;

import com.hand.am.pojo.OrdersExt;

import java.util.List;

/**
 * @Author: 王俊
 * @Date: 2019/7/19 9:20
 **/
public interface OrdersDao {
    /**
     * 根据条件查询订单详情
     *
     * @param ordersExt 条件
     * @return 结果
     */
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);

    /**
     * 返回结果用resultMap
     *
     * @param ordersExt 条件
     * @return 结果
     */
    List<OrdersExt> findOrdersToResultMap(OrdersExt ordersExt);

    /**
     * 一对多查询
     *
     * @param ordersExt 条件
     * @return 结果
     */
    List<OrdersExt> findOrdersAndOrderDetails(OrdersExt ordersExt);

    /**
     * 延迟加载
     *
     * @param i id
     * @return 结果
     */
    List<OrdersExt> findOrderByLazyLoad(int i);
}
