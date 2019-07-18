package com.hand.dao;

import com.hand.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.net.UnknownServiceException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    //全局唯一，整合到spring之后,使用单例
    private SqlSessionFactory sqlSessionFactory;

    //根据spring的setter方式注入
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) {
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询,第一个参数是命名空间,sql的ID,第二个参数是查询的参数
        User user =  sqlSession.selectOne("test.findUserById",id);
        //关闭sqlSession，释放连接
        return user;
    }

    public List<User> findUserByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.findUserByUsername","'%"+ username+"%'");
        sqlSession.close();
        return users;
    }

    public int addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int result =  sqlSession.insert("test.addUser",user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
