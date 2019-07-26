package com.hand.service.user.service;

import com.hand.service.user.pojo.User;

import java.util.List;

/**
 * @Author: 王俊
 * @Date: 2019/7/26 15:29
 **/
public interface UserService {
    List<User> findAll();

    User findById(Integer id);

    int add(User user);

    int update(User user);

    int delete(Integer id);
}
