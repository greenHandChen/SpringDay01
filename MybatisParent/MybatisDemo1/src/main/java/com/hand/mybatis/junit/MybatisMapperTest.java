package com.hand.mybatis.junit;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.hand.mybatis.mapper.OrderMapper;
import com.hand.mybatis.mapper.UserMapper;
import com.hand.mybatis.pojo.Order;
import com.hand.mybatis.pojo.QueryVo;
import com.hand.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybatisMapperTest {


    @Test
    public void testMapper() throws Exception {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //SqlSEssion帮我生成一个实现类  （给接口）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


        User user = userMapper.findUserById(28);
        System.out.println(user);
    }


    @Test
    public void testQueryMapper() throws Exception {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //SqlSEssion帮我生成一个实现类  （给接口）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setUsername("张");
        QueryVo vo = new QueryVo();
        vo.setUser(user);

        List<User> u = userMapper.findUserByName(vo);
        for (User s : u) {
            System.out.println(s);
        }

    }


    @Test
    public void testOrderMapper() throws Exception {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //SqlSEssion帮我生成一个实现类  （给接口）
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        List<Order> O = orderMapper.slectOrderList();
        for (Order order : O) {
            System.out.println(order);
        }

    }


    @Test
    public void testFindUserBySexAndName() throws Exception {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //SqlSEssion帮我生成一个实现类  （给接口）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("hsl");
        user.setSex("1");
        List<User> users = userMapper.selectUserBySexAndName(user);
        for (User user1 : users
        ) {
            System.out.println(user1);
        }


    }

    @Test
    public void testFindUserByIds() throws Exception {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //SqlSEssion帮我生成一个实现类  （给接口）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(29);
        ids.add(30);
        ids.add(32);
//        QueryVo vo = new QueryVo();
//        vo.setListids(ids);



//        List<User> users = userMapper.findUserByIds(vo);
        //对应的Mapper的collection 类型是list
        List<User> users = userMapper.findUserByIds(ids);
        for (User user1 : users
        ) {
            System.out.println(user1);
        }


    }


}
