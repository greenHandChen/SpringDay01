package com.jqh.dao;

import com.jqh.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.Date;

/**
 * @Auther: 几米
 * @Date: 2019/7/18 10:12
 * @Description: UserDao
 */
public class UserDao {
    static private SqlSessionFactory sqlSessionFactory;

    static {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  public   User findByUserId(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("com.jqh.mapper.findUserById", id);
        sqlSession.close();
        return user;
    }

   public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int insert = sqlSession.insert("com.jqh.mapper.addUser", user);
        sqlSession.commit();
        sqlSession.close();
        return insert;
    }

}
