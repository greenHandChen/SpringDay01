package com.ljx.mybatisdemo.mapper;

import com.ljx.mybatisdemo.po.User;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 9:43
 */
public interface OrdersMapper {

    //多对多
    List<User> findUserAndItemsRstMap();
}
