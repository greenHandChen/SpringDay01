package com.masirhh.mybatis.dao;

import com.masirhh.mybatis.beans.User;

import java.util.List;

public interface UserDao {

    User findUserById(Integer id);
    List<User> findUserByUsername(String username);
    int addUser(User user);
}
