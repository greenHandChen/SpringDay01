package com.itheima.mybatis.dao;

import com.itheima.mybatis.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;

public class UserDaoImpl implements UserDao {

    //依赖注入
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User finUserById(int id) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById",1);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByName(String name) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("test.findUsersByName",name);
        sqlSession.close();
        return list;
    }

    public void insertUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("test.insertUser",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
}
