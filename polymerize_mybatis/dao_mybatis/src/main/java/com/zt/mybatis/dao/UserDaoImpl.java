package com.zt.mybatis.dao;

import com.zt.mybatis.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-18 10:56
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        /**
         * @description: 模拟spring的setter方式注入
         * @author: invokerZt
         * @date: 2019-07-18 10:58
         * @param sqlSessionFactory: 
         * @return: void
         */
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        /**
         * @description: 根据id查询用户
         * @author: invokerZt
         * @date: 2019-07-18 10:56
         * @param id:
         * @return: com.zt.mybatis.domain.User
         */
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("com.zt.mybatis.mapper.UserMapper.findUserById", id);
        sqlSession.close();
        return user;
    }

    public int insertUser(User user) {
        /**
         * @description: 添加用户
         * @author: invokerZt
         * @date: 2019-07-18 11:11
         * @param user:
         * @return: int
         */
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int rows = sqlSession.insert("com.zt.mybatis.mapper.UserMapper.addUser", user);
        sqlSession.commit();
        sqlSession.close();
        return rows;
    }
}
