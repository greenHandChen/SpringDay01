package com.me.dao;

import com.me.entity.User;

import java.util.List;

public interface IUSerDao {
    public int insertUser(User user);
    public int deleteUser(Integer id);

    public List<User> selectAllUser();

    public User selectUserById(Integer id);
}
