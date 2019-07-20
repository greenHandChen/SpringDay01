package com.yts.dao;

import com.yts.beans.User;

public interface UserDao {

    User findUserById(Integer id);
}
