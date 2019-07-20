package com.frank.mapper;

import com.frank.pojo.Order;
import com.frank.pojo.OrderUser;
import com.frank.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    User findUserById(Integer id);
}
