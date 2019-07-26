package com.hjf.service;

import com.hjf.pojo.User;

import java.util.List;

public interface UserService {
    List<User> queryUser();
    Integer deleteUser(Integer id);
    boolean addUser(User user);
    boolean updateUser(User user);
}
