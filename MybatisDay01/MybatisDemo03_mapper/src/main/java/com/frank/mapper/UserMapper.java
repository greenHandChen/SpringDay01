package com.frank.mapper;

import com.frank.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 根据id查询用户
     * @param id
     * @return User
     */
    User findUserById(Integer id);

    /**
     * 根据用户的姓获取用户列表
     * @param username
     * @return
     */
    List<User> findUserByUsername(String username);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);
}
