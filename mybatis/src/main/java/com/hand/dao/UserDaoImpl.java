package com.hand.dao;

import com.hand.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements  UserDao {
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User findUserById(Integer id) {
        SqlSession sqlSession =sqlSessionFactory.openSession();
        User user =sqlSession.selectOne("test.findUserById",id);
        return user;
    }

    @Override
    public List<User> findUserByUsername(String username) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }
}
