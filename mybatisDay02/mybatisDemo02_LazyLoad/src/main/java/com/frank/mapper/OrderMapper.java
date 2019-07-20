package com.frank.mapper;

import com.frank.pojo.Order;
import com.frank.pojo.OrderUser;

import java.util.List;

public interface OrderMapper {


    /**
     * 使用ResultMap实现一对一关联查询
     */
    List<Order> findOrderInfoByLazyLoad(Integer id);
}
