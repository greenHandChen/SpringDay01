package com.test.mapper;

import com.test.pojo.User;

/**
 * @description: UserMapper
 * @author: xueWu.Chen
 * @create: 2019-07-20
 **/

public interface UserMapper {
    User findUserById(int id);
}
