package com.hand.dao.impl;

import com.hand.bean.User;
import com.hand.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImplTwo extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User getUserById(Integer id) {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.selectOne("test.getUserById", id);
    }
}
