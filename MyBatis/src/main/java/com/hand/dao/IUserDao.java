package com.hand.dao;

import com.hand.entity.User;

import java.util.List;

public interface IUserDao{
    User selectUserById(int id);
    int insertUser(User user);
    List<User> selectAllUser();
}
