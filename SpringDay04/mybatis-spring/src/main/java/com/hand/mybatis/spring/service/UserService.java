package com.hand.mybatis.spring.service;

import com.hand.mybatis.spring.pojo.User;

/**
 * @Author: 王俊
 * @Date: 2019/7/19 14:47
 **/
public interface UserService {
    User findUserById(Integer id);
}
