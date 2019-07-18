package org.hgh.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.hgh.dao.UserDao;
import org.hgh.pojo.User;

import java.util.List;

/**
 * mybatis原始dao开发方式
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;

    //模拟spring注入方式
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById",1);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> user = sqlSession.selectList("test.findUserByUsername",username);
        sqlSession.close();
        return user;
    }

    public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int result = sqlSession.insert("test.addUser",user);
        sqlSession.close();
        return result;
    }
}
