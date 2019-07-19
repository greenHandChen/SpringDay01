package com.ll.mybatis.test;

import com.ll.mybatis.mapper.OrdersMapper;
import com.ll.mybatis.mapper.UserMapper;
import com.ll.mybatis.po.OrderExt;
import com.ll.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class OrdersMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception{
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    //使用result来进行一对一结果进行映射，查询出的列的个数和映射的属性的
    //个数要一致，且映射的属性要存在于一个大的对象中，他是一种平铺式的映射
    //即数据库查询出多少条记录，就会创建生成多少个对象
    //一对一resultMap
    @Test
    public void testFindOrdersAndUser(){
        //创建OrdersMapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrderExt> list = mapper.findOrdersAndUser();
        list.forEach(System.out::println);

        sqlSession.close();
    }

    //使用resultMap来进行一对一结果映射，它是将关联对象添加到主信息的对象中，
    //具体说是一种对象嵌套对象的映射方式
    //在一对一结果期间时，使用resultType更加简单方便，如果有特殊要求（对象嵌套对象）时
    //需要使用resultMap进行映射，比如：查询订单列表，然后在点击列表中
    //查看订单明细按钮，这个时候就需要用resultMap进行结果映射。而reslutType更加适应于
    // 查询明细信息。比如查询订单明细信息
    //一对一ResultType
    @Test
    public void testFindOrdersAndUserRst(){
        //创建OrdersMapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrderExt> list = mapper.findOrdersAndUserRstMap();
        list.forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testFindOrdersAndUserAndDetailsRst(){
        //创建OrdersMapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrderExt> list = mapper.findOrdersAndUserAndDetailsRstMap();
        list.forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testFindUserAndItemsRst(){
        //创建OrdersMapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<User> list= mapper.findUserAndItemsRst();
        list.forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testLazyLoading(){
        //创建OrdersMapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrderExt> list= mapper.findOrderAndUserLazyLoading();
        list.forEach( a -> System.out.println(a.getUser()));

        sqlSession.close();
    }

    @Test
    public void testOneLevelCache(){
        //擦混构建USerMapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //第一次查询
        User userById = mapper.findUserById(1);
        System.out.println(userById);

        //执行添加操作
        mapper.insertUser(userById);
        //执行commit时将缓存清空
        sqlSession.commit();

        //第二次查询
        User userById2 = mapper.findUserById(1);
        System.out.println(userById2);

        sqlSession.close();
    }

    @Test
    public void testTwoLevelCache(){
        //创建爱你UserMapper对象
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        //由Mybatis通过sqlSession来创建代理对象,二级缓存区域指的是同一个NameSpace下的同一个Mapper文件
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper mapper3 = sqlSession3.getMapper(UserMapper.class);

        //第一次查询
        User user1 = mapper1.findUserById(1);
        System.out.println(user1);
        //在close的时候才会将二级缓存写入到缓存中
        sqlSession1.close();

        mapper3.insertUser(user1);
        sqlSession3.commit();

        //第二次查询
        User user2 = mapper2.findUserById(1);
        System.out.println(user2);
        sqlSession2.close();
        //第三次查询
        User user3 = mapper3.findUserById(1);
        System.out.println(user3);
        sqlSession3.close();

    }
}
