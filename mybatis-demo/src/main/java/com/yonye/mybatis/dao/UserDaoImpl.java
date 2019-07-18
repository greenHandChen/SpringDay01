package com.yonye.mybatis.dao;

import com.yonye.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/18
 * @Version:1.0
 * @deseription:
 **/
public class UserDaoImpl implements UserDao{

    //全局为，整合到spring之后，使用单例
    private SqlSessionFactory sqlSessionFactory;

    //模拟spring的setter方式注入
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }


    public User findUserById(Integer id) {
        //1、获取sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //2、致性查询，第一个参数是命名空间，sql的ID，第二个参数是查询的参数
        User user=sqlSession.selectOne("test.findUserById",id);
        //3、关闭sqlSession（释放连接）
        sqlSession.close();
        return user;
    }


    public List<User> findUserByUserName(String username) {
        //1、获取sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //2、${}占位符的sql注入演示
        List<User> users=sqlSession.selectList("test.findUserByUserName","'%"+username+"%'");
        //3、关闭sqlSession（释放连接）
        sqlSession.close();
        return users;
    }

    public int addUser(User user) {
        //1、获取sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //2、${}占位符的sql注入演示
        sqlSession.insert("test.addUserGetId",user);
        //3、关闭sqlSession（释放连接）
        sqlSession.close();
        return user.getId();

    }
}
