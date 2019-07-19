package com.hand.Dao;

import com.hand.mybatis.User;

import java.util.List;

public interface UserMapper {
    //通过ID查找用户
    public User findUserById(int id);
    //通过名称模糊查询用户列表
    public List<User> findUsersByName(String name);
    //添加用户
    public void insertUser(User user);
}