package com.mapper;

import com.domain.OrdersExt;

import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:02 2019/7/19
 * @Modified By:
 */
public interface OrdersMapper {
    //延迟加载
    List<OrdersExt> findOrdersAndUserLazyLoading();
}
