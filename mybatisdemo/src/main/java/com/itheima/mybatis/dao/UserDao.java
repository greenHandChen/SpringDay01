package com.itheima.mybatis.dao;

import com.itheima.mybatis.po.User;

import java.io.IOException;
import java.util.List;

public interface UserDao {

    //1，根据用户id查询用户信息
    public User finUserById(int id) throws Exception;
    //2，根据用户名称模糊查询用户列表
    public List<User> findUserByName(String name) throws Exception;
    //3，添加用户
    public void insertUser(User user) throws Exception;
}
