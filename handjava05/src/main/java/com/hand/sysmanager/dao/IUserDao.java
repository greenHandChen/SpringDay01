package com.hand.sysmanager.dao;

import com.hand.sysmanager.entity.OrdersExt;
import com.hand.sysmanager.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Author: LWY
 * @Date: 2019/7/18 15:25
 */
public interface IUserDao {
    /**
     * @Description:
     * @Param: [ordersExt]
     * @return: java.util.List<com.hand.sysmanager.entity.OrdersExt>
     * @Author: LWY
     * @Date: 2019/7/19 10:34
     */
    List<OrdersExt> findOrdersExt(OrdersExt ordersExt);

    List<OrdersExt> findOrdersByResultMap(OrdersExt ordersExt);

    List<OrdersExt> findOrdersAndOrderDetail(OrdersExt ordersExt);

    List<OrdersExt> findOrderInfoByLazyLoad(@Param("id") Long id);

    User findUserById(@Param("userId") Long userId);


}
