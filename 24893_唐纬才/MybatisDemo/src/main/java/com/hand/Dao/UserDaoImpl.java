package com.hand.Dao;

import com.hand.mybatis.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {

    //依赖注入
    private SqlSessionFactory sqlSessionFactory;

    //模拟Spring setter注入
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(int id) {
        // 1.获取sqlsession
        SqlSession sqlSession= sqlSessionFactory.openSession();
        //2、调用Sqlsession的查方法
        User user=sqlSession.selectOne("test.findUserById",id);
        // 3、关闭sqlsession
        sqlSession.close();
        System.out.println(user.getName());
        return user;

    }

    public List<User> findUsersByName(String name) {
        // 1.获取sqlsession
        SqlSession sqlSession= sqlSessionFactory.openSession();
        // 2、获取结果列表
        List<User> list=sqlSession.selectList("test.findUsersByName",name);
        // 3、关闭连接
        sqlSession.close();
        return list;
    }

    public void insertUser(User user) {
        // 1.获取sqlsession
        SqlSession sqlSession= sqlSessionFactory.openSession();
        // 2、插入数据
        sqlSession.insert("test.insertUser",user);
        // 3、关闭连接
        sqlSession.close();
    }
}