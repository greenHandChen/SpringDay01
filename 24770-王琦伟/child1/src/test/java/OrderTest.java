import com.hand.dao.OrdersMapper;
import com.hand.vo.OrdersExt;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class OrderTest {

    private ApplicationContext applicationContext;
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before(){
        applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        sqlSessionFactory = applicationContext.getBean("sqlSessionFactory",SqlSessionFactory.class);
    }
    @Test
    public void test1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper orders = sqlSession.getMapper(OrdersMapper.class);
        OrdersExt o = new OrdersExt();
        o.setName("笔记本");
        List<OrdersExt> ordersExts = orders.findOrdersExts(o);
        System.out.println(ordersExts);

    }
}
