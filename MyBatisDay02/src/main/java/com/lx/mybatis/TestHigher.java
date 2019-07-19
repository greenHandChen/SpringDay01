package com.lx.mybatis;

import com.lx.mybatis.Entity.OrdersExt;
import com.lx.mybatis.Entity.OrdersExt2;
import com.lx.mybatis.Entity.User;
import com.lx.mybatis.Entity.UserMany;
import com.lx.mybatis.Mapper.OrdersMapper;
import com.lx.mybatis.Mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestHigher {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

//    @Test
//    public void findOrdersExt(){
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
//        OrdersExt ordersExt = new OrdersExt();
//        ordersExt.setId(3);
//        OrdersExt ordersExt_result = ordersMapper.findOrdersExt(ordersExt);
//        System.out.println(ordersExt_result);
//        sqlSession.close();
//    }

    @Test
    public void testResultMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

        List<OrdersExt> list = mapper.findOrdersByResultMap();
        System.out.println(list.get(1).getUser());
        sqlSession.close();
    }

    @Test
    public void testResultMap2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

        List<OrdersExt2> list = mapper.findOrdersAndOrderDetail();
        System.out.println(list.get(1).getUser());
        sqlSession.close();
    }

    // 测试多对多
    @Test
    public void testResultMap3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

        List<UserMany> list = mapper.findUserAndItemsResultMap();
        sqlSession.close();
    }


    // 测试懒加载
    @Test
    public void findOrderInfoByLazyLoad(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        List<OrdersExt> ordersExts = ordersMapper.findOrderInfoByLazyLoad(4);

        // 当积极懒加载为true时，使用OrdersExt的任意属性就会触发用户查询的懒加载；
        ordersExts.get(0).getNumber();

        // 为false时,只有使用user属性才会触发用户查询的懒加载
//        for(OrdersExt ordersExt:ordersExts){
//            User user = ordersExt.getUser();
//            System.out.println(user);
//        }
        sqlSession.close();
    }

    // 测试一级缓存
    @Test
    public void testFirstCacheDemo01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 两次查询,第二次从SqlSession一级缓存中读取
        // commit（增删改）后会清空缓存，防止脏读
        userMapper.findUserById(1);
        userMapper.findUserById(1);
        sqlSession.close();
    }

    @Test
    public void testFirstCacheDemo02(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 两次查询，中间新增了新用户，将会清空SqlSession
        // 只有第一次走数据库，第二次从缓存中读取
        userMapper.findUserById(1);

        User user = new User();
        user.setUsername("缓存测试");
        userMapper.addUser(user);

        userMapper.findUserById(1);
        sqlSession.close();
    }

    /**
     * 二级缓存测试
     * 二级缓存是mapper级别的，是跨sqlSession的。
     * 配置步骤
     * 1、配置全局配置文件
     * 2、配置映射配置文件mapper.xml，通过cache标签开启mapper的二级缓存
     * 3、实现序列化，由于二级缓存的数据不一定都是存储到内存中，它的存储介质多种多样，
     *    所以需要给缓存的对象执行序列化。如果该类存在父类，那么父类也要实现序列化。
     * 测试结果：
     * 测试一：
     *     1、第一次缓存中没有记录，命中率为0.0；
     *     2、第二次缓存中有记录，命中率为0.5（访问两次，有一次命中）。
     * 测试二：
     * 先查询用户，再插入用户commit之后清楚二级缓存，再次查询从数据库查询
     */
    @Test
    public void testSecondCacheDemo02(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);

//        //测试一
//        userMapper1.findUserById(1);
//        sqlSession1.close();
//        userMapper2.findUserById(1);
//        sqlSession2.close();

        //测试二
        userMapper1.findUserById(1);
        sqlSession1.close();
        User user = new User();
        user.setUsername("二级缓存测试");
        userMapper3.addUser(user);
        //清空二级缓存
        sqlSession3.commit();
        sqlSession3.close();

        userMapper2.findUserById(1);
        sqlSession2.close();
    }


}
