package com.frank.dao;

import com.frank.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(Integer id) {
        return super.getSqlSession().selectOne("test.findUserById",id);
    }
}
