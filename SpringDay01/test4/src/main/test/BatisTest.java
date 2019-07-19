import common.OrdersExt;
import domain.User;
import mapper.OrderMapper;
import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BatisTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

    }

    @Test
    public void testDemoA() throws IOException {
        //
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(6);
        List<OrdersExt> ordersExtList = orderMapper.findOrdersExt(ordersExt);
        System.out.println(ordersExtList);
        sqlSession.close();
    }

    @Test
    public void testDemoB() throws IOException {
        //
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(6);
        List<OrdersExt> ordersExtList = orderMapper.findOrdersByResultMap(ordersExt);
        System.out.println(ordersExtList);
        sqlSession.close();
    }

    @Test
    public void testDemoC() throws IOException {
        //
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrdersExt> ordersExtList = orderMapper.findOrderInfoByLazyLoad(4);
        ordersExtList.get(0).getUser();
        sqlSession.close();
    }

    @Test
    public void testFirstCacheDemo01() throws IOException {
        //
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.findById(1);
        User user=new User();
        user.setUserName("缓存测试");
        userMapper.addUser(user);
        userMapper.findById(1);
        sqlSession.close();
    }
    @Test
    public void testFirstCacheDemo02() throws IOException {
        //
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
        userMapper1.findById(1);
        sqlSession1.close();
        userMapper2.findById(1);
        sqlSession2.close();
        userMapper3.findById(1);
        sqlSession3.close();
    }
    @Test
    public void testFirstCacheDemo03() throws IOException {
        //
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
        userMapper1.findById(1);
        sqlSession1.close();
        User user=new User();
        user.setUserName("二级缓存测试");
        userMapper3.addUser(user);
        sqlSession3.commit();
        sqlSession3.close();
        userMapper2.findById(1);
        sqlSession2.close();

    }
}
