package com.mybatis.mapper;

import com.mybatis.pojo.OrderEx;
import com.mybatis.pojo.User;

import java.util.List;

/**
* @Description:  订单表的Mapper 接口
* @Author: xueWu.Chen
* @Date: 2019/7/19
*/ 
public interface OrderMapper {
    public List<OrderEx> getOrderAndUser();
    public List<OrderEx> getOderUserDetail();
    public List<User> getUserByAll();
}
