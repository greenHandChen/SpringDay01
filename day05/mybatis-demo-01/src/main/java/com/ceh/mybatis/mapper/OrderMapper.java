package com.ceh.mybatis.mapper;

import com.ceh.mybatis.domain.OrdersExt;

import java.util.List;

/**
 * Created by enHui.Chen on 2019/7/9.
 */
public interface OrderMapper {

    /**
     * @Author: enHui.Chen
     * @Description: 根据订单ID查询订单以及用户信息
     * @Data 2019/7/9
     */
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);

    /**
     * @Author: enHui.Chen
     * @Description: 根据订单ID查询订单以及用户信息by-resultMap
     * @Data 2019/7/9
     */
    List<OrdersExt> findOrdersByResultMap(OrdersExt orders);

    /**
     * @Author: enHui.Chen
     * @Description: 根据订单ID查询订单，订单的明细以及用户信息
     * @Data 2019/7/9
     */
    List<OrdersExt> findOrdersAndOrderDetail(OrdersExt orders);

    /**
     * @Author: enHui.Chen
     * @Description: 根据订单ID进行延迟加载查询
     * @Data 2019/7/9
     */
    List<OrdersExt> findOrderInfoByLazyLoad(Integer id);
}
