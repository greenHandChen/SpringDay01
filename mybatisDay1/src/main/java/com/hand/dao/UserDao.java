package com.hand.dao;

import com.hand.bean.User;

import java.util.List;

public interface UserDao {
    User findUserById(Integer id);

    List<User> findByUsername(String username);

    int insertInfo(User user);

}
