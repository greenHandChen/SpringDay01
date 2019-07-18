package com.yts.mapper;

import com.yts.beans.User;

import java.util.List;

public interface UserMapper {
    User findUserById(int id);

    List<User> findUserByUsername(String username);

    int addUser(User user);
}
