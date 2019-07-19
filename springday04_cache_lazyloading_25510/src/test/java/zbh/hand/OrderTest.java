package zbh.hand;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zbh.hand.mappers.OrdersMapper;
import zbh.hand.pojo.OrderExt;
import zbh.hand.pojo.Orders;
import zbh.hand.pojo.User;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author: wuhui
 * @time: 2019/7/19 9:51
 * @desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class OrderTest {
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    
    @Autowired
    OrdersMapper mapper;
    
    @Test
    public void test(){
        System.out.println(mapper.selectById(3));
    }
    @Test
    public void test2(){
       System.out.println(mapper.selectOrderAndUser(3));

    }
    @Test
    public void test3(){
        System.out.println(mapper.selectOrderAndUserAndDetails(3));
    }
    /*test lazyloading */
    @Test
    public void testLazyloading(){
        OrderExt orderExt = mapper.selectOrderInfoByLazyload(3);
        //System.out.println(orderExt.getUsername()+orderExt.toString());
        System.out.println(1);
    }
    /*test cache level 1*/
    @Test
    public void testCache(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper m=sqlSession.getMapper(OrdersMapper.class);
        m.selectOrderInfoByLazyload(3);
        m.selectOrderInfoByLazyload(3);
        sqlSession.close();
        System.out.println("done");
    }
    /*test cache level 2*/
    @Test
    public void testCache2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        OrdersMapper m=sqlSession.getMapper(OrdersMapper.class);
        OrdersMapper m2=sqlSession2.getMapper(OrdersMapper.class);
        m.selectOrderAndUser(3);
        sqlSession.close();
        m2.selectOrderAndUser(3);
        sqlSession2.close();

        System.out.println("done");
    }
    /*test cache level 2*/
    @Test
    public void testCache3() throws ParseException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        OrdersMapper m=sqlSession.getMapper(OrdersMapper.class);
        OrdersMapper m2=sqlSession2.getMapper(OrdersMapper.class);
        OrdersMapper m3=sqlSession3.getMapper(OrdersMapper.class);

        m.selectOrderAndUser(3);
        sqlSession.close();

        Orders orders=new Orders();
        orders.setId(7);
        Long ms=new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01").getTime();
        orders.setCreatetime(new Date(ms));
        orders.setNote("note");
        orders.setUserId(2);
        orders.setNumber("test");
        m2.addOrder(orders);
        sqlSession2.commit();
        sqlSession2.close();

        m3.selectOrderAndUser(3);
        sqlSession3.close();

        System.out.println("done");
    }
}
