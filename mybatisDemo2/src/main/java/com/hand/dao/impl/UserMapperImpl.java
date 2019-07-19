package com.hand.dao.impl;

import com.hand.dao.UserMapper;
import com.hand.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * ClassName:UserMapperImpl
 * Author:ZhangChunjia
 * Date:2019/7/19 16:57
 */
public class UserMapperImpl implements UserMapper {
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public void addUser(User user) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.update("addUser");

    }

    @Override
    public User findUserById(Integer id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("findUserById");

        return user;
    }
}
