package com.zt.eureka_producer_ext.mapper;

import com.zt.eureka_producer_ext.dto.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-26 16:18
 */
@Mapper
public interface OrdersMapper {

    List<Orders> selectOrdersByName(String username);

    Orders selectOrdersById(@Param("id") Integer id);
}
