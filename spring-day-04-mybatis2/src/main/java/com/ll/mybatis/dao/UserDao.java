package com.ll.mybatis.dao;

import com.ll.mybatis.po.User;

import java.util.List;

public interface UserDao {

    User findUserById(int id);

    List<User> findUserByName(String name);

    void insertUser(User user);

}
