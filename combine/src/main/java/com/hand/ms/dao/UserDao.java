package com.hand.ms.dao;

import com.hand.ms.po.User;

/**
 * @Author xiongyilin
 * @Date 2019/7/19 15:04
 * @Version 1.0
 */

public interface UserDao {
    //根据用户ID查找用户信息
    public User findUserById(int id) throws Exception;
}

