package com.lhb.dao.impl;

import com.lhb.dao.UserDao;
import com.lhb.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created By LHB on 2019/7/18;
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById", id);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.findUserByUsername", "'%" + username + "%'");
        sqlSession.close();
        return users;
    }

    public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int val = sqlSession.insert("test.addUser", user);
        sqlSession.close();
        return val;
    }

    public int addUserGetId(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int val = sqlSession.insert("test.addUserGetId", user);
        sqlSession.close();
        return user.getId();
    }
}
