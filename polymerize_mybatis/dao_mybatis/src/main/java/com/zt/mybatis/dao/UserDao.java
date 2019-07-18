package com.zt.mybatis.dao;

import com.zt.mybatis.domain.User;

/**
 * @description: UserDao接口
 * @author: invokerZt
 * @date: 2019-07-18 10:45
 */
public interface UserDao {

    /**
     * @description: 根据id查询用户
     * @author: invokerZt
     * @date: 2019-07-18 10:48
     * @param null:
     * @return:
     */
    User findUserById(Integer id);

    /**
     * @description: 添加用户
     * @author: invokerZt
     * @date: 2019-07-18 10:54
     * @param null:
     * @return:
     */
    int insertUser(User user);
}
