package com.ceh.java.examine.mapper;


import com.ceh.java.examine.domain.OrdersExt;

import java.util.List;

/**
 * Created by enHui.Chen on 2019/7/9.
 */
public interface OrderMapper {

    /**
     * @Author: enHui.Chen
     * @Description: 查询订单明细数据
     * @Data 2019/7/20
     */
    List<OrdersExt> findOrdersExts(OrdersExt ordersExt);
}
