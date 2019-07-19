package com.hand.dao;

import com.hand.domain.User;

public interface UserDao {

    User findUserById(Integer id);
}
