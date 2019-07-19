package com.hand.smybatis.dao;

import com.hand.smybatis.pojo.User;

public interface UserDao {

    User findUserById(Integer id);

}
