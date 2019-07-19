package mybatis.dao.daoMapper;

import mybatis.enity.Order;
import mybatis.enity.OrderDetail;
import mybatis.enity.OrdersExt;
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

import static org.junit.Assert.*;

public class OrderMapperTest {

    private static SqlSession sqlSession = null;

    @Before
    public void setUp() throws IOException {
        String resouce = "Mybatis_Config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @After
    public void destory() {
        sqlSession.close();
    }

    @Test
    public void OrderTest() {
//        基于resultType复杂查询结果返回
//        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
//        OrdersExt ordersExt = orderMapper.findOrderByid(3);
//        System.out.println(ordersExt.getUsername());
//        自定义resultMap进行结果返回
//        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
//        List<Order> orders = orderMapper.findOrderByMap(3);
//        for (Order order : orders) {
//            System.out.println(order.getUser().getUsername());
//        }

//      一对多collection结果集查询
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orders = orderMapper.findOrderByCollection(3);
        for (Order order : orders) {
            for (OrderDetail orderDetail : order.getOrderDetailList()) {
                System.out.println(orderDetail.getOrdersId());
            }
        }

    }

}