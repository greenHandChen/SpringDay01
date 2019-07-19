package com.lzn.spring.dao;

import com.lzn.spring.entity.UserEntity;

public interface IUserDao {
    UserEntity findUserById(Integer id);
}
