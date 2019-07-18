package com.txz.mybatis.dao;

import com.txz.mybatis.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements  UserDao{

    //全局唯一，整合spring之后，使用单例
    private SqlSessionFactory sqlSessionFactory;

    //模拟spring的setter方法注入
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        //1.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.执行查询，第一参数是命名空间.sql的ID，第二个参数是查询的参数
        User user = sqlSession.selectOne("test.findUserById", id);
        //3.释放连接
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        //1.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.#{}占位符的sql注入
        List<User> users = sqlSession.selectList("test.findUserByUsername", username);
        //3.释放连接
        sqlSession.close();
        return users;
    }

    public int addUser(User user) {
        //1.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //添加用户
        int insert = sqlSession.insert("test.addUser", user);
        //提交事务
        sqlSession.commit();
        //关闭事务
        sqlSession.close();
        return insert;
    }
}
