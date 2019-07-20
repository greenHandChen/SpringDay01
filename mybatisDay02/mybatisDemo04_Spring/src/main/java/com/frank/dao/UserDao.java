package com.frank.dao;

import com.frank.pojo.User;

public interface UserDao {
    /**
     * 通过用户id获取用户信息
     * @param id
     * @return
     */
    User findUserById(Integer id);
}
