package com.ljx.mybatisspring.mapper;

import com.ljx.mybatisspring.po.User;

/**
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 11:48
 */
public interface UserMapper {
    // 1、 根据用户ID查询用户信息
    User findUserById(int id) throws Exception;
}
