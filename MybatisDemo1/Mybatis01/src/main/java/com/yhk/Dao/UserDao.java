package com.yhk.Dao;

import com.yhk.Pojo.User;

import java.util.List;

public interface UserDao {
    User findUserById(Integer id);
    List<User> fingUserByName(String username);
    int addUser(User user);
}
