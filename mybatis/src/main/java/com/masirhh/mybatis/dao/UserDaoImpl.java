package com.masirhh.mybatis.dao;

import com.masirhh.mybatis.beans.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Date;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public void  serSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById", 10);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.findUserByUsername", "'%"+username+"%'");
        sqlSession.close();
        return users;
    }

    public int addUser(User user1) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setUsername(user1.getUsername());
        user.setSex(user1.getSex());
        user.setAddress(user1.getAddress());
        user.setBirthday(user1.getBirthday());
        int code=sqlSession.insert("test.insertUser", user);
        sqlSession.commit();
        sqlSession.close();
        return code;
    }
}
