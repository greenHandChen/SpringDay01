package com.ct.mapper;

import com.ct.domain.User;

import java.util.List;

public interface UserMapper {
    User findUserById(Integer id);
    void addUserGetId(User user);
    List<User> findUserByUsername(String username);
}
