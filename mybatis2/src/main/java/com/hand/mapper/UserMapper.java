package com.hand.mapper;

import com.hand.pojo.User;

public interface UserMapper {
    User findUserById(Integer id);
    int addUser(User user);
}
