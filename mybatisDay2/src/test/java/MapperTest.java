import com.sy.bean.OrderDetail;
import com.sy.bean.OrdersExt;
import com.sy.bean.User;
import com.sy.mapper.UserMapper;
import com.sy.mapper.UserMappers;
import com.sy.mapper.orderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
@ComponentScan("com.sy.bean")
public class MapperTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("config/ApplicationConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);

    }
    @Autowired
    private OrdersExt ordersExt;

    /**
     * 基于resulttype测试
     */
    @Test
    public void findOrdersExt(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        orderMapper mapper = sqlSession.getMapper(orderMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(3);
        List<OrdersExt> extList = mapper.findOrdersExt(ordersExt);
        for (OrdersExt ordersext:extList
             ) {
            System.out.println(ordersext);
        }

        sqlSession.close();
    }

    /**
     * 测试resultMap类型
     */
    @Test
    public void findOrdersExtRstmap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        orderMapper mapper = sqlSession.getMapper(orderMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(3);
        List<OrdersExt> extList = mapper.findOrdersExtRstmap(ordersExt);
        for (OrdersExt ordersExt1:extList
             ) {
            System.out.println(ordersExt1.toString());
        }
    }
    /**
     * 测试resultMap一对多类型
     */
    @Test
    public void findOrdersAndOrderDetail(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        orderMapper mapper = sqlSession.getMapper(orderMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(3);
        List<OrdersExt> extList = mapper.findOrdersAndOrderDetail(ordersExt);
        for (OrdersExt ordersExt1:extList
        ) {
            System.out.println("sss");
            for (OrderDetail orderDetail:ordersExt1.getOrderDetails()
                 ) {
                System.out.println(orderDetail.toString());
            }
            System.out.println(ordersExt1.toString());
        }
    }

    /**
     * 测试懒加载
     */
    @Test
    public void findByOrderInfoBylazyLoad(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        orderMapper mapper = sqlSession.getMapper(orderMapper.class);
        List<OrdersExt> extList = mapper.findByOrderInfoBylazyLoad(3);
        //只查询不调用不会进行数据库调用，当进行调用就会进行懒加载
        System.out.println("没有进行数据库查询");
        for (OrdersExt ordersExt1:extList
        ) {
            System.out.println(ordersExt1.toString());
        }
    }

    /**
     * Spring 整合mybatis
     */
    @Test
    public void mapperTestdemo1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/SpringBeanConfig.xml");
        UserMappers userMapper = applicationContext.getBean("userMappers", UserMappers.class);
        User userById = userMapper.findUserById(1);
        System.out.println(userById.toString());
    }
}
