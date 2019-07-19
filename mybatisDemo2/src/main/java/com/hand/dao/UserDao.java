package com.hand.dao;

import com.hand.entity.User;

public interface UserDao {
    User findUserById(Integer id);
}
