package com.hand.Test;

import com.hand.Dao.UserDao;
import com.hand.Dao.UserDaoImpl;
import com.hand.Dao.UserMapper;
import com.hand.mybatis.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setSqlSessionFactory() throws IOException {
        //读取配置文件
        //全局配置文件路径
        String resource="config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建SQLSessionFactory
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void TestFindUserById()
    {
       /* UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        User user =userDao.findUserById(1);
        System.out.println(user);*/

        SqlSession sqlSession =sqlSessionFactory.openSession();
        //由mybatis通过sqlsession采用Mapper代理
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        User user=mapper.findUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void TestFindUsersByName()
    {
        /*UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
         List<User>list=userDao.findUsersByName("小明");*/

        SqlSession sqlSession =sqlSessionFactory.openSession();
        //由mybatis通过sqlsession采用Mapper代理
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        List<User>list=mapper.findUsersByName("小明");

    }
    @Test
    public void TestInsertUser()
    {
       User user=new User();
        user.setName("india");
        user.setSex("男");
        /*
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        userDao.insertUser(user);*/

        SqlSession sqlSession =sqlSessionFactory.openSession();
        //由mybatis通过sqlsession采用Mapper代理
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(user);
        sqlSession.commit();
        sqlSession.close();
        return;
    }
}