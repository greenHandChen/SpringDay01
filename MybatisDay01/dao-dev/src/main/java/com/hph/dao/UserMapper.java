package com.hph.dao;

import com.hph.entity.User;

import java.util.List;

public interface UserMapper {

    User findUserById(Integer id);

    List<User> findUserByUsername(String username);

    int addUser(User user);
}
