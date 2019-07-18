package com.yts.dao;

import com.yts.beans.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User findUserById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询 第一个参数 命名空间.sql 的ID ，第二个参数是查询的参数
        User user = sqlSession.selectOne("test.findUserById",   id);
        System.out.println(user.toString());

        // 关闭sqlsession（释放连接）
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询 第一个参数 命名空间.sql 的ID ，第二个参数是查询的参数
        List<User> users = sqlSession.selectList("test.findUserByUsername", username);
        System.out.println(users.toString());

        // 关闭sqlsession（释放连接）
        sqlSession.close();
        return users;
    }

    @Override
    public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询 第一个参数 命名空间.sql 的ID ，第二个参数是查询的参数
        int val = sqlSession.insert("test.addUser", user);
        sqlSession.commit();

        // 关闭sqlsession（释放连接）
        sqlSession.close();
        return val;
    }
}
