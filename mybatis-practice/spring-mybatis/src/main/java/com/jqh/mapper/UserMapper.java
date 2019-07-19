package com.jqh.mapper;

import com.jqh.pojo.User;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 10:45
 * @Description: UserMapper
 */
public interface UserMapper {
    public User findUserById(Integer id);
}
