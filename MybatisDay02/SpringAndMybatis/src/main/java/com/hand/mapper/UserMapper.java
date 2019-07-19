package com.hand.mapper;

import com.hand.domain.User;

public interface UserMapper {
    User findUserById(Integer id);
}
