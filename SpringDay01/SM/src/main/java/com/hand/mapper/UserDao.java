package com.hand.mapper;

import com.hand.domain.User;

public interface UserDao {
    User findById(Integer id);
}
