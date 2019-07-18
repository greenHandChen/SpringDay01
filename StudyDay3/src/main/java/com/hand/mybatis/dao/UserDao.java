package com.hand.mybatis.dao;

import com.hand.mybatis.po.User;

import java.util.List;

/**
 * @Author xiongyilin
 * @Date 2019/7/18 15:42
 * @Version 1.0
 */

public interface UserDao {
    public User findUserById(int id) throws Exception;

    public List<User> findUserByName(String name) throws Exception;

    public void insertUser(User user) throws Exception;

}
