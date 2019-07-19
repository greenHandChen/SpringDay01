package com.lx.mybatis.dao;

import com.lx.mybatis.dao.UserDao;
import com.lx.mybatis.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    public User findUserById(Integer id) {
        return getSqlSession().selectOne("test.findUserById",id);
    }
}
