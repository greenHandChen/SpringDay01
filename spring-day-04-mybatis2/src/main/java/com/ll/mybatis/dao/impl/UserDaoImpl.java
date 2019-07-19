package com.ll.mybatis.dao.impl;

import com.ll.mybatis.dao.UserDao;
import com.ll.mybatis.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {

    //依赖注入
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }


    @Override
    public User findUserById(int id) {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("test.findUserById", id);
        //关闭资源
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByName(String name) {
        //创建Sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> users = sqlSession.selectList("test.findUserByName", name);

        sqlSession.close();
        return users;
    }

    @Override
    public void insertUser(User user) {
        //创建Sqlsession ->自动创建了事务
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //调用sqlSession的增删改查方法
        //第一个参数，表示statement的唯一标识
        //第二个参数，表示传入参数类型
        sqlSession.insert("test.insertUser", user);
        System.out.println(user.getId());

        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
    }
}
