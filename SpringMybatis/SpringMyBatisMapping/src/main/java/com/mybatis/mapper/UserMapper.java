package com.mybatis.mapper;

import com.mybatis.pojo.User;

public interface UserMapper {
    User findUserById(int id);
}
