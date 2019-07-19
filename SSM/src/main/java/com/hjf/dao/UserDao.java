package com.hjf.dao;

import com.hjf.pojo.User;

public interface UserDao {
    User findUserById(Integer id);
}
