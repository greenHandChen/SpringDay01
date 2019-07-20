package com.yts.dao;

import com.yts.beans.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("test.findUserById",id);
    }
}
