import com.hph.dao.OrderMapper;
import com.hph.dao.UserMapper;
import com.hph.entity.OrderExt;
import com.hph.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {

    private SqlSessionFactory sqlSessionFactory;

    private SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
    }

    @After
    public void closeSqlSession() {
        sqlSession.close();
    }

    @Test
    public void demo1() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(5);
        List<OrderExt> orderExts = orderMapper.findOrderExt(orderExt);
        System.out.println(orderExts.get(0).getUsername() + " " + orderExts.get(0).getNumber());
    }

    @Test
    public void demo2() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(4);
        List<OrderExt> orderExts = orderMapper.findOrdersByRstMap(orderExt);
        System.out.println(orderExts.get(0).getId());
        System.out.println(orderExts.get(0).getUser().getUsername());
        System.out.println(orderExts.get(0).getUser().getAddress());
    }

    @Test
    public void demo3() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(4);
        List<OrderExt> orderExts = orderMapper.findOrderAndOrderDetail(orderExt);
        System.out.println(orderExts.get(0).getId());
        System.out.println(orderExts.get(0).getUser().getUsername());
        System.out.println(orderExts.get(0).getUser().getAddress());
        System.out.println(orderExts.get(0).getOrderDetails().get(0).getItemsNum());
    }

    @Test
    public void demo4() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrderExt orderExt = new OrderExt();
        orderExt.setId(4);
        List<OrderExt> orderExts = orderMapper.findOrderAndOrderDetail(orderExt);
        System.out.println(orderExts.get(0).getId());
        System.out.println(orderExts.get(0).getUser().getUsername());
        System.out.println(orderExts.get(0).getUser().getAddress());
        System.out.println(orderExts.get(0).getOrderDetails().get(0).getItemsNum());
    }

    @Test
    public void demo5() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderExt> orderExts = orderMapper.findOrderInfoByLazyLoad(4);
        System.out.println(orderExts.get(0).getId());
        System.out.println(orderExts.get(0).getUser().getUsername());
    }

    @Test
    public void demo6() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.findUserById(1);
        int i = 1;
        userMapper.findUserById(1);
        System.out.println("over");
    }

    @Test
    public void demo7() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.findUserById(1);
        User user = new User();
        user.setUsername("缓存测试");
        userMapper.addUser(user);
        userMapper.findUserById(1);
        System.out.println("over");
    }

    @Test
    public void testCache1() {
       SqlSession sqlSession1 = sqlSessionFactory.openSession();
       SqlSession sqlSession2 = sqlSessionFactory.openSession();
       UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
       UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
       userMapper1.findUserById(1);
       sqlSession1.close();
       userMapper2.findUserById(1);
       sqlSession2.close();
    }

    @Test
    public void testCache2() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
        userMapper1.findUserById(1);
        sqlSession1.close();

        User user = new User();
        user.setUsername("测试二级缓存");
        userMapper3.addUser(user);
        sqlSession3.commit();
        sqlSession3.close();

        userMapper2.findUserById(1);
        sqlSession2.close();
    }
}
