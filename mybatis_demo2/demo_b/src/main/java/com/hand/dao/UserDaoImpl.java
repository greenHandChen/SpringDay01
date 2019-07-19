package com.hand.dao;

import com.hand.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("com.hand.mapper.findUserById",id);
    }
}
