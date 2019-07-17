package com.hand.dao;

import com.hand.bean.User;

import java.util.List;

public interface IUSerDao {
    public int insertUser(User user);
    public int deleteUser(Integer id);

    public List<User> selectAllUser();

    public User selectUserById(Integer id);
}
