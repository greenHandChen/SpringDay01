package com.hand.dao.impl;

import com.hand.dao.UserDao;
import com.hand.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * ClassName:UserDaoImpl
 * Author:ZhangChunjia
 * Date:2019/7/19 19:33
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("test.findUserById",id);
    }
}
