package com.yts.dao;

import com.yts.beans.User;

import java.util.List;

public interface UserDao {

    User findUserById(int id);

    List<User> findUserByUsername(String username);

    int addUser(User user);
}
