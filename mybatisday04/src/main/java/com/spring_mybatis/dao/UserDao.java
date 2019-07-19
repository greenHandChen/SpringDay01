package com.spring_mybatis.dao;

import com.mybatis.pojo.User;

import java.util.List;

public interface UserDao {
    User findUserById(Integer id);
}
