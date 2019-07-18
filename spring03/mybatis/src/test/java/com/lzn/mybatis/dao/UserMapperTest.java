package com.lzn.mybatis.dao;

import com.lzn.mybatis.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Description mapper代理测试
 * @Author LinZhenNan
 * @Date 2019/7/18
 * @Time 20:03
 */
public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/SqlMapConfig.xml"));

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void findUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUserById(1));
        sqlSession.close();
        System.out.println("findUserById() end");
    }

    @Test
    public void findUserByUsername() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUserByUsername("hehe"));
        sqlSession.close();
        System.out.println("findUserByUsername() end");
    }

    @Test
    public void addUser() {
        UserEntity user = new UserEntity();
        user.setUsername("hehe");
        user.setAddress("test of userMapper addUser()");
        user.setBirthday(new Date());
        user.setSex(new Integer(1));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.addUser(user));
        sqlSession.commit();
        sqlSession.close();
        System.out.println("addUser() end");
    }

    /**
     * @Description map查询
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 20:23
     */
    @Test
    public void findUserByMap(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", "hehe");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUserByMap(map));
        sqlSession.close();
        System.out.println("findUserByMap() end");
    }

    /**
     * @Description 查询用户总数
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 20:23
     */
    @Test
    public void testCount(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.countUser());
        sqlSession.close();
        System.out.println("testCount() end");
    }

    /**
     * @Description 获取用户名和地址
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 20:28
     */
    @Test
    public void findUserNameAndAddressById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUserNameAndAddressById(1));
        sqlSession.close();
        System.out.println("findUserNameAndAddressById() end");
    }


    /**
     * @Description 映射获取
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 20:36
     */
    @Test
    public void testResultMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.testResultMap(1));
        sqlSession.close();
        System.out.println("testResultMap() end");
    }

    @Test
    public void testIfAndWhereLabel() {
        UserEntity user = new UserEntity();
        user.setUsername("hehe");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.testIfAndWhereLabel(user));
        sqlSession.close();
        System.out.println("testIfAndWhereLabel() end");
    }
}