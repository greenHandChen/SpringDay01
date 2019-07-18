package com.hand.dao;

import com.hand.pojo.User;

import java.util.List;

public interface UserDao {
    User findUserById(Integer id);

    List<User> findUserByUsername(String val);

    int addUser(User user);
}
