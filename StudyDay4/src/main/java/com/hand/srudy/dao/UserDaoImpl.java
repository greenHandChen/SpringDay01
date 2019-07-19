package com.hand.srudy.dao;

import com.hand.srudy.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;


public abstract class UserDaoImpl implements UserDao
{
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
    {
        this.sqlSessionFactory = sqlSessionFactory;
    }


    public User findUserById(Long userId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("com.hand.sysmanager.dao.IUserDao.findUserById",userId);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("com.hand.sysmanager.dao.IUserDao.findUserByUsername","'%" + username + "%'");
        sqlSession.close();
        return list;

    }

    public Long addUser(User user) {
        return null;
    }

    public Long addUserGetId(User user) {
        return null;
    }

    public Long addUserGetUUID(User user) {
        return null;
    }
}