package com.hph.dao;

import com.hph.entity.User;

public interface UserMapper {

    User findUserById(Integer id);
}
