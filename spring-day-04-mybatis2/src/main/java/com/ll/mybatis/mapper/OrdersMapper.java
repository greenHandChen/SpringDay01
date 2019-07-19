package com.ll.mybatis.mapper;

import com.ll.mybatis.po.OrderExt;
import com.ll.mybatis.po.User;
import com.ll.mybatis.po.UserQueryVO;

import java.util.HashMap;
import java.util.List;

public interface OrdersMapper {

    //一对一之resulttype
    public List<OrderExt> findOrdersAndUser();

    //一对一之resultMap
    public List<OrderExt> findOrdersAndUserRstMap();

    //一对多
    public List<OrderExt> findOrdersAndUserAndDetailsRstMap();

    //多对多
    public List<User> findUserAndItemsRst();

    //延迟加载
    public List<OrderExt> findOrderAndUserLazyLoading();

}
