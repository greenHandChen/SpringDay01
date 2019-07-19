package com.lx.mybatis.mapper;

import com.lx.mybatis.domain.User;

public interface UserMapper {
    User findUserById(Integer id);
}
