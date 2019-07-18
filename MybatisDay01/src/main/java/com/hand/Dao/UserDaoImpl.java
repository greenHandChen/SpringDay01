package com.hand.Dao;

import com.hand.domain.User;
import com.hand.domain.UserQueryVO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao{
    //全局唯一，整合到spring之后，使用单例
    private SqlSessionFactory sqlSessionFactory;
    //模拟spring的setter方式注入
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        //1.获取sqlSession
        SqlSession  sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserById",id);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("test.findUserByUsername","'%"+username+"%'");
        sqlSession.close();
        return list;
    }

    public int addUser(User user) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        int a=sqlSession.insert("test.addUser",user);
        sqlSession.commit();
        sqlSession.close();
        return a;
    }

    public int addUserGetId(User user) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        int a=sqlSession.insert("test.addUserGetId",user);
        sqlSession.commit();
        sqlSession.close();
        return a;
    }


}
