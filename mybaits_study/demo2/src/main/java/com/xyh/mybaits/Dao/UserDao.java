package com.xyh.mybaits.Dao;

import com.xyh.mybaits.Entity.User;

import java.util.List;

public interface UserDao {

    User findUserById(Integer id);

    List<User> findUserByName(String name);

    void addUser(User user);

    void updateById(User user);

    void deleteById(Integer id);
}
