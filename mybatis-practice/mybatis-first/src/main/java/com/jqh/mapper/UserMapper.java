package com.jqh.mapper;

import com.jqh.pojo.User;

/**
 * @Auther: 几米
 * @Date: 2019/7/18 10:27
 * @Description: UserMapper
 */
public interface UserMapper {
    public int addUser(User user);
    public int addUserGetId(User user);

    public User findUserById(Integer id);
}
