package com.txz.mybatis.dao;

import com.txz.mybatis.domain.User;

import java.util.List;

public interface UserDao {

    //根据id查询用户
    User findUserById(Integer id);

    //根据用户名获取用户列表
    List<User> findUserByUsername(String username);

    //添加用户
    int addUser(User user);
}
