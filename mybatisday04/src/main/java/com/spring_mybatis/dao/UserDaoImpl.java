package com.spring_mybatis.dao;

import com.mybatis.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("test.findUserById",id);
    }
}
