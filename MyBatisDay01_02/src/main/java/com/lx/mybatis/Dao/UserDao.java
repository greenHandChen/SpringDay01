package com.lx.mybatis.Dao;

import com.lx.mybatis.Entity.User;

import java.util.List;

public interface UserDao {

    User findUserById(Integer id);

    List<User> findUserByUsername(String username);

    int addUser(User user);
}
