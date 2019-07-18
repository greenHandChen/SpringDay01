package com.softeem.dao;

import com.softeem.dto.User;

import java.util.List;

public interface UserDao {

    public User findUserById(int id);

    public List<User> findUserByUsername(String username);

    public int addUser(User user);
    public int addUser1(User user);
    public int addUser2(User user);

    public int countUser();
}