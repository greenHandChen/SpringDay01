package com.mybatis.dao;

import com.mybatis.pojo.User;

/**
* @Description:  用于spring整合mybatis的User表的接口
* @Author: xueWu.Chen
* @Date: 2019/7/19
*/
public interface IUserDao {
    User getUserById(int id);
}
