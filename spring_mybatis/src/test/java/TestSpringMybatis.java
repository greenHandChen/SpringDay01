import com.zt.smybatis.domain.*;
import com.zt.smybatis.mapper.OrderMapper;
import com.zt.smybatis.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;


/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-19 10:18
 */
public class TestSpringMybatis {

    private UserMapper userMapper;

    private OrderMapper orderMapper;

    @Before
    public void init() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\spring_mybatis\\src\\main\\resources\\config\\applicationContext.xml");
        userMapper = applicationContext.getBean("userMapper", UserMapper.class);
        orderMapper = applicationContext.getBean("orderMapper", OrderMapper.class);
    }

    @Test
    public void test_01() {
        /**
         * @description: 以Mapper代理的方式测试Spring整合Mybatis
         * @author: invokerZt
         * @date: 2019-07-19 10:18
         * @param :
         * @return: void
         */
        User user = userMapper.findUserById(28);
        System.out.println(user);
    }
    
    @Test
    public void test_02() {
        /**
         * @description: 基于resultType得一对一映射
         * @author: invokerZt
         * @date: 2019-07-19 11:30
         * @param : 
         * @return: void
         */
        OrderExt orderExt = new OrderExt();
        orderExt.setId(5);
        OrderExt order = orderMapper.findOrderByResultType(orderExt);
        System.out.println(order);
    }

    @Test
    public void test_03() {
        /**
         * @description: 基于resultMap的一对一映射
         * @author: invokerZt
         * @date: 2019-07-19 11:58
         * @param :
         * @return: void
         */
        OrderExt2 orderExt2 = new OrderExt2();
        orderExt2.setId(5);
        OrderExt2 order = orderMapper.findOrdersByResultMap(orderExt2);
        System.out.println(order);
    }

    @Test
    public void test_04() {
        /**
         * @description: 基于resultMap的一对多映射
         * @author: invokerZt
         * @date: 2019-07-19 14:36
         * @param :
         * @return: void
         */
        OrderExt3 orderExt3 = new OrderExt3();
        orderExt3.setId(4);
        OrderExt3 orderExt3s = orderMapper.findOrdersAndOrderDetail(orderExt3);
        System.out.println(orderExt3s);
        System.out.println(orderExt3s.getOrderDetails().toString());
    }

    @Test
    public void test_05() {
        /**
         * @description: 基于resultMap的多对多映射
         * @author: invokerZt
         * @date: 2019-07-19 15:30
         * @param :
         * @return: void
         */
        Order order = new Order();
        order.setId(4);
        List<OrderDetailExt> orderDetailExts = orderMapper.findItemsAndOrdersDetail(order);
        System.out.println(orderDetailExts);
    }
}
