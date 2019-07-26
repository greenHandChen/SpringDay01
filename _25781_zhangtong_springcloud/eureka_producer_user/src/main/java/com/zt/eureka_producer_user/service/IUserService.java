package com.zt.eureka_producer_user.service;

import com.zt.eureka_producer_user.dto.User;

import java.util.List;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-26 11:48
 */
public interface IUserService {

    // 根据用户名模糊查询用户
    List<User> queryUserByName(String username);

    // 根据id精确查找用户
    User queryUserById(Integer id);

    // 添加用户
    int addUser(User user);

    // 更新用户信息
    int updateUser(User user);

    // 删除用户
    int deleteUser(Integer id);
}
