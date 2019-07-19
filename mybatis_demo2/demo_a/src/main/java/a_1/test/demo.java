package a_1.test;

import a_1.domain.OrdersExt;
import a_1.domain.User;
import a_1.mapper.OrdersMapper;
import a_1.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class demo {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {

        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void findOrdersExt(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        OrdersExt ordersExt = new OrdersExt();

        ordersExt.setId(3);

        List<OrdersExt> ordersExtList = ordersMapper.findOrdersExt(ordersExt);

        if (ordersExtList.size() > 0){
            System.out.println(ordersExtList.get(0));
            System.out.println(ordersExtList.get(0).getId());
            System.out.println(ordersExtList.get(0).getCreatetime());
            System.out.println(ordersExtList.get(0).getNumber());
            System.out.println(ordersExtList.get(0).getNote());
        }

        sqlSession.close();
    }

    @Test
    public void findOrdersByResultMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        OrdersExt ordersExt = new OrdersExt();

        ordersExt.setId(2);

        List<OrdersExt> ordersExtList = ordersMapper.findOrdersByResultMap(ordersExt);

        if (ordersExtList.size() > 0){
            System.out.println(ordersExtList.get(0));
        }

        sqlSession.close();
    }

    @Test
    public void findOrdersAndOrderDetail(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        OrdersExt ordersExt = new OrdersExt();

        ordersExt.setId(1);

        List<OrdersExt> ordersExtList = ordersMapper.findOrdersAndOrderDetail(ordersExt);

        if (ordersExtList.size() > 0){
            System.out.println(ordersExtList.get(0));
            System.out.println(ordersExtList.get(0).getOrderDetails().get(0));
        }

        sqlSession.close();
    }

    @Test
    public void findOrderInfoByLazyLoad(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        List<OrdersExt> ordersExtList = ordersMapper.findOrderInfoByLazyLoad(2);

        System.out.println(ordersExtList.get(0).getUser());

        sqlSession.close();
    }

    @Test
    public void testFirstCacheDemo01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //两次查询第二次不走数据库
        userMapper.findUserById(1);

        userMapper.findUserById(1);

        sqlSession.close();
    }

    /**
      * @Author: MikeLv
      * @Description: 一级缓存查询
      * @Date: 2019/7/19 16:29
      */
    @Test
    public void testFirstCacheDemo02(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.findUserById(1);

//        User user = new User();
//        user.setId(4);
//        user.setUsername("缓存测试");
//        user.setAddress("广东广州");
//        System.out.println(userMapper.addUser(user));
//        sqlSession.commit();
        userMapper.findUserById(1);
        sqlSession.close();
    }

    /**
      * @Author: MikeLv
      * @Description: 二级缓存查询
      * @Date: 2019/7/19 16:29
      */
    @Test
    public void testSecondCacheDemo02(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);

        userMapper1.findUserById(1);
        sqlSession1.close();

//        User user = new User();
//        user.setId(5);
//        user.setUsername("二级缓存测试");
//        user.setAddress("广东珠海");
//        userMapper3.addUser(user);
//        sqlSession3.commit();
//        sqlSession3.close();

        userMapper2.findUserById(1);
        sqlSession2.close();
    }
}
