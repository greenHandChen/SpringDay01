package com.sy.impl;

import com.sy.bean.User;
import com.sy.dao.UserDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    public User findByUserId(Integer id) {
        return this.getSqlSession().selectOne("test.findUserById",id);
    }
}
