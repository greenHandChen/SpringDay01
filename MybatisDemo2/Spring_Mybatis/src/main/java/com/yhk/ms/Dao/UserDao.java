package com.yhk.ms.Dao;

import com.yhk.ms.Pojo.User;

public interface UserDao {
    //根据用户ID查询用户信息
    User findUserById(Integer id);

}
