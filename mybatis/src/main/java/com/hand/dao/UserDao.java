package com.hand.dao;

import com.hand.domain.User;

import java.util.List;

public interface UserDao {
    User findUserById(Integer id);
    List<User> findUserByUsername(String username);
    int addUser(User user);
}
