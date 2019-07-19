package com.lx.mybatis.dao;

import com.lx.mybatis.domain.User;

public interface UserDao {
    User findUserById(Integer id);
}
