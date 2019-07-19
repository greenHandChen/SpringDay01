package com.sy.dao;

import com.sy.bean.User;

public interface UserDao {
        User findByUserId(Integer id);
}
