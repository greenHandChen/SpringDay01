package com.ljx.mybatisspring.dao;

import com.ljx.mybatisspring.po.User;

/**
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 11:51
 */
public interface UserDao {
    // 1、 根据用户ID查询用户信息
    User findUserById(int id) throws Exception;
}
