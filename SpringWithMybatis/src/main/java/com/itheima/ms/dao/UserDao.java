package com.itheima.ms.dao;

import com.itheima.ms.po.User;

public interface UserDao {

    public User findUserById(int id) throws Exception;

}
