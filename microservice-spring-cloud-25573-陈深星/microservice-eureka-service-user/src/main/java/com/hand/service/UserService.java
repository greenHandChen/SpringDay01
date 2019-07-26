package com.hand.service;

import com.hand.entity.User;

import java.util.List;

public interface UserService {

    // 用户列表
    public List<User> userList();

    // 查询用户
    public User getUserById(Integer id);


}
