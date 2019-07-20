package com.hand.mybatis.spring.dao;

import com.hand.mybatis.spring.pojo.User;

/**
 * @Author: 王俊
 * @Date: 2019/7/19 14:08
 **/
public interface UserDao {
    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    User findUserById(Integer id);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int addUser(User user);
}
