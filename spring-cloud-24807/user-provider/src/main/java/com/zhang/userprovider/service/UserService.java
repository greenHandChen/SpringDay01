package com.zhang.userprovider.service;

import com.zhang.userprovider.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    Integer addUser(User user);

    Integer deleteUser(Integer id);

    Integer updateUser(User user);
}
