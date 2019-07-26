package com.hand.mike.provider.service;

import com.hand.mike.provider.domain.Orders;

import java.util.List;

public interface OrdersService {

    /**
     * @Author: MikeLv
     * @Description: 查询订单信息
     * @Date: 2019/7/26 11:54
     */
    Orders getOrderById(Integer id);

    /**
     * @Author: MikeLv
     * @Description: 删除订单信息
     * @Date: 2019/7/26 11:55
     */
    Integer deleteOrderById(Integer id);

    /**
     * @Author: MikeLv
     * @Description: 添加订单
     * @Date: 2019/7/26 11:56
     */
    Integer addOrder(Orders order);

    /**
     * @Author: MikeLv
     * @Description: 更新订单
     * @Date: 2019/7/26 14:07
     */
    Integer updateOrder(Orders order);

    /**
     * @Author: MikeLv
     * @Description: 获取全部订单
     * @Date: 2019/7/26 14:11
     */
    List<Orders> getAllOrders();

}
