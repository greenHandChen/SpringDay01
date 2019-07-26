package com.hjf.mapper;

import com.hjf.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> queryUser();
    Integer deleteUser(Integer id);
    boolean addUser(User user);
    boolean updateUser(User user);
}
