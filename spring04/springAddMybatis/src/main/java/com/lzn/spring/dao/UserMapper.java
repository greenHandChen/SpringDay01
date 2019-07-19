package com.lzn.spring.dao;

import com.lzn.spring.entity.UserEntity;

public interface UserMapper {
    UserEntity findUserById(Integer id);
}
