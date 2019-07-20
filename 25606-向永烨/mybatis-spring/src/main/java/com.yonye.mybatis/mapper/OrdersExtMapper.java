package com.yonye.mybatis.mapper;

import com.yonye.mybatis.pojo.OrdersExt;
import com.yonye.mybatis.pojo.User;

import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/20 15:32
 * @Version:1.0
 * @deseription:
 **/
public interface OrdersExtMapper {

    List<User>  selectTest();

    OrdersExt findOrdersExts(OrdersExt ordersExt);

}
