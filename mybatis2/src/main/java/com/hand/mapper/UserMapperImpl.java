package com.hand.mapper;

import com.hand.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * ClassName:UserMapperImpl
 * Author:Hejunfeng
 * Date:2019/7/19 18:33
 */
public class UserMapperImpl implements UserMapper {
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
    {
        this.sqlSessionFactory=sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("userMapper.findUserById",id);
        sqlSession.close();
        return user;
    }

    public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.selectOne("addUser");
        sqlSession.close();
        return 1;
    }
}