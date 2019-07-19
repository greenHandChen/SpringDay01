package com.ljx.mybatisdemo.mapper;

import com.ljx.mybatisdemo.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 11:11
 */
public class UserMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        // 读取配置文件
        // 全局配置文件的路径
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testOneLevelCache() throws Exception {
        // 创建UserMapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 由mybatis通过sqlsession来创建代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        // 第一次查询
        User user1 = mapper.findUserById(1);
        System.out.println(user1);

        // 执行添加用户操作
        mapper.insertUser(user1);
        // 执行commit时，将一级缓存清空
        sqlSession.commit();

        // 第二次查询
        User user2 = mapper.findUserById(1);
        System.out.println(user2);

        sqlSession.close();
    }

    @Test
    public void testTwoLevelCache() throws Exception {
        // 创建UserMapper对象
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        // 由mybatis通过sqlsession来创建代理对象
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper mapper3 = sqlSession3.getMapper(UserMapper.class);

        // 第一次查询
        User user1 = mapper1.findUserById(1);
        System.out.println(user1);
        // 在close的时候，才会将数据写入到二级缓存中
        sqlSession1.close();

        // 执行添加用户操作
        // mapper3.insertUser(user1);
        // 执行commit时，将一级缓存清空
        // sqlSession3.commit();

        // 第二次查询
        User user2 = mapper2.findUserById(1);
        System.out.println(user2);
        sqlSession2.close();

        // 关闭资源
        sqlSession3.close();
    }
}