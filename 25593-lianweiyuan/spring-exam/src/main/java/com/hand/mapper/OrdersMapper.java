package com.hand.mapper;

import com.hand.entity.OrderExt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @Description: OrdersMapper接口
 * @Date: 2019/7/20 15:20 
 */
@Mapper
public interface OrdersMapper {
    /**
     * @Description: findOrdersExts
     * @Param: [orderExt]
     * @return: java.util.List<com.hand.entity.OrderExt>
     * @Author: LWY
     * @Date: 2019/7/20 15:21 
     */
    List<OrderExt> findOrdersExts(@Param("orderExt") OrderExt orderExt);
}