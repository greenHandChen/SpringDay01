package com.hand.am.dao;

import com.hand.am.pojo.User;

/**
 * @Author: 王俊
 * @Date: 2019/7/19 11:14
 **/
public interface UserDao {
    User findUserById(Integer id);
    int addUser(User user);
}
