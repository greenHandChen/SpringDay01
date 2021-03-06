package com.ceh.mybatis.dao;

import com.ceh.mybatis.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by enHui.Chen on 2019/7/8.
 */
public class UserDaoImpl implements UserDao {

    // 全局唯一,整合到spring之后,使用单例
    private SqlSessionFactory sqlSessionFactory;

    // 模拟spring的setter方式注入
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        // 1.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 2.执行查询,第一个参数是命名空间.sql的ID,第二个参数是查询的参数
        User user = sqlSession.selectOne("test.findUserById", id);
        // 3.关闭sqlSession(释放连接)
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        // 1.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 2.${}占位符的sql注入演示
        List<User> users = sqlSession.selectList("test.findUserByUsername", "'%" + username + "%'");
        // 3.关闭sqlSession(释放连接)
        sqlSession.close();
        return users;
    }

    public int addUser(User user) {
        // 1.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 2.${}占位符的sql注入演示
        int val = sqlSession.insert("test.addUser", user);
        // 3.提交事务
        sqlSession.commit();
        // 4.关闭sqlSession(释放连接)
        sqlSession.close();
        return val;
    }
}
