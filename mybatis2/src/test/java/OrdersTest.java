import domain.OrdersExt;
import domain.User;
import mapper.OrdersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OrdersTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/mybatis/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void demo1(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> ordersExts = mapper.findOrdersExt(ordersExt);
        System.out.println(ordersExts.toString());
        sqlSession.close();
    }

    @Test
    public void demo2(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(5);
        List<OrdersExt> ordersExts = mapper.findOrdersByResultMap(ordersExt);
        System.out.println(ordersExts);
        sqlSession.close();
    }

    @Test
    public void demo3(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt = new OrdersExt();
//        ordersExt.setId(4);
        List<OrdersExt> ordersExts = mapper.findOrdersAndOrderDetail(ordersExt);
        System.out.println(ordersExts);
        sqlSession.close();
    }

    @Test
    public void demo4(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(4);
        List<User> ordersExts = mapper.findUserAndItemsRstMap(ordersExt);
        System.out.println(ordersExts);
        sqlSession.close();
    }

    @Test
    public void demo5(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> ordersExts = mapper.findOrderByLazyLoad(3);
        System.out.println(ordersExts);
        sqlSession.close();
    }
}
