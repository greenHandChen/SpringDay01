package com.lx.mybatis.Dao.Impl;

import com.lx.mybatis.Dao.UserDao;
import com.lx.mybatis.Entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {

    //全局唯一，整合到Spring之后，使用单例
    private SqlSessionFactory sqlSessionFactory;

    //模拟spring的setter方法注入
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        //获取session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("test.findUserById",id);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.findUserByUsername","'%"+username+"%'");
        sqlSession.close();
        return users;
    }

    public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("test.addUser",user);
        sqlSession.commit();
        sqlSession.close();
        return 1;
    }
}
