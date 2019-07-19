package com.ljx.mybatisdemo.mapper;

import com.ljx.mybatisdemo.po.User;

/**
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 10:54
 */
public interface UserMapper {
    // 1、 根据用户ID查询用户信息
    User findUserById(int id) throws Exception;

    // 3、 添加用户
    void insertUser(User user) throws Exception;
}
