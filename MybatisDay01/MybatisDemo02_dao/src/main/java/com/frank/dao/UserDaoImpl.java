package com.frank.dao;

import com.frank.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {

    //和Spring整合之后,使用单例,这就是全局变量
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @Override
    public User findUserById(Integer id) {
        //获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //查询一个用户使用selectOne
        User user = sqlSession.selectOne("test.getUserById", id);
        sqlSession.close();
        //返回查询到的user对象
        return user;
    }

    /**
     * 根据用户名返回用户列表
     * @param username
     * @return
     */
    @Override
    public List<User> findUserByUsername(String username) {
        //获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //根据用户姓名返回用户列表使用selectList方法
        List<User> list = sqlSession.selectList("test.getUserByUsername", username);
        sqlSession.close();
        return list;
    }

    @Override
    public int addUser(User user) {
        //获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //添加一个用户
        int row = sqlSession.insert("test.addUser", user);
        //提交插入
        sqlSession.commit();
        sqlSession.close();
        return row;
    }
}
