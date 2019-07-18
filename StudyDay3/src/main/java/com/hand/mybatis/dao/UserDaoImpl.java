package com.hand.mybatis.dao;

import com.hand.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @Author xiongyilin
 * @Date 2019/7/18 15:48
 * @Version 1.0
 */

public class UserDaoImpl implements UserDao {
    //依赖注入
    private SqlSessionFactory sqlSessionFactory;

    //通过构造方法注入
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User findUserById(int id) throws Exception {
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //调用SqlSession的增删改查，第一个参数表示statement的唯一标识
        //精确查询，根据用户id查用户信息
        User user = sqlSession.selectOne("test.findUserByID", id);
        System.out.println(user);

        //关闭资源
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByName(String name) {
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //模糊查询,根据用户名称查列表
        List<User> list = sqlSession.selectList("test.findUserByName", name);
        System.out.println(list);

        //关闭资源
        sqlSession.close();
        return list;
    }

    @Override
    public void insertUser(User user) {
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //插入新用户
        sqlSession.insert("test.insertUser", user);
        //获取主键的值
        System.out.println(user.getId());
        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
    }
}
