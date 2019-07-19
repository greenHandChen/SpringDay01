package com.tlq.dao;

import com.tlq.enity.Order;
import com.tlq.enity.OrdersExt;

import java.util.List;

/**
 * @Description: OrderMapper
 * @Author: TanLinQuan
 * @Date: 2019/7/19 9:17
 * @Version: V1.0
 **/
public interface OrderMapper {

    /**
    * @Description: 根据ID查找订单
    * @Author: TanLinQuan
    * @Date: 2019/7/19 9:21
    * @params: [id]
    * @return: mybatis.enity.OrdersExt
    **/
    OrdersExt findOrderByid(Integer id);

    /**
    * @Description: 以自定的resultMap定义的返回结果集
    * @Author: TanLinQuan
    * @Date: 2019/7/19 10:08
    * @params: [id]
    * @return: java.util.List<mybatis.enity.Order>
    **/
    List<Order> findOrderByMap(Integer id);

    /**
    * @Description: 一对多查询
    * @Author: TanLinQuan
    * @Date: 2019/7/19 10:31
    * @params: [id]
    * @return: java.util.List<mybatis.enity.Order>
    **/
    List<Order> findOrderByCollection(Integer id);
}
