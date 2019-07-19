package com.yonye.mybatis.mapper;

import com.yonye.mybatis.vo.OrdersExt;

import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/19 14:59
 * @Version:1.0
 * @deseription:
 **/
public interface LazyLoadRstMappper {
    List<OrdersExt> findOrderInfoByLazyLoad(Integer id);
}
