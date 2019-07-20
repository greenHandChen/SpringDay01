package com.itheima.ms.mapper;

import com.itheima.ms.po.User;

public interface UserMapper {

    public User findUserById(int id) throws Exception;
}
