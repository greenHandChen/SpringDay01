package com.yhk.Mapper;

import com.yhk.Pojo.Orderdetail;
import com.yhk.Pojo.OrdersExt;
import com.yhk.Pojo.User;
import com.yhk.Pojo.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface OrdersMapper {
    /**
     * 根据订单Id查询订单以及用户信息
     */
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);

    /**
     * 使用Map映射 一对一
     */
    List<OrdersExt> findOrdersAndUserRstMap(OrdersExt ordersExt);

    /**
     *使用Map映射 一对多
     */
    List<Orderdetail> findOrdersAndDetailRetMap(OrdersExt ordersExt);


    /**
     *使用Map映射 多对多
     * 根据用户ID查询商品信息
     */
    List<User> findUserAndItemsRstMap();


    /**
     * 根据订单信息进行延迟加载查询
     */
    List<OrdersExt> findOrderInfoByLazyLoad(Integer id);
}
