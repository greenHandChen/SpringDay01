package com.lzn.spring.dao;

import com.lzn.spring.entity.OrdersExt;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderMapper {
    /**
     * @Description 查询 OrdersExt
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 10:11
     */
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);

    /**
     * @Description 一对一查询
     * @Param  * @param null
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 11:12
     */
    List<OrdersExt> findOrdersByResultMap(OrdersExt orders);

    /**
     * @Description 一对多查询
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 11:34
     */
    List<OrdersExt> findOrdersAndOrderDetail(OrdersExt orders);

    /**
     * @Description 根据订单 id进行延迟加载查询
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 14:46
     */
    List<OrdersExt> findOrderInfoByLazyLoad(Integer id);
}
