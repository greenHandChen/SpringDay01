package com.hand.dao;

import com.hand.entity.User;

public interface UserMapper {
    void addUser(User user);
    User findUserById(Integer id);
}
