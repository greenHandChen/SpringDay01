package com.xyh.spring_mybaits.Dao;

import com.xyh.spring_mybaits.Entity.User;

public interface UserDao {

    User findUserById(Integer id);
}
