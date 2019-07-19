package com.ljx.mybatisdemo.mapper;

import com.ljx.mybatisdemo.po.OrdersExt;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 10:54
 */
public interface OrdersMapper {
    //延迟加载
    List<OrdersExt> findOrderAndUserLazyLoading();
}
