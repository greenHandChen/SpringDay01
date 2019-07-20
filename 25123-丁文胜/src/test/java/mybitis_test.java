import com.hand.mapper.UserMapper;
import com.hand.pojo.OrdersExt;
import com.hand.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author dingwensheng
 * @description: TODO
 * @date
 */

public  class mybitis_test {

    @Test
    public void demo01() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
        UserMapper userMapper = (UserMapper)applicationContext.getBean("userMapper");
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(3);
        List<OrdersExt> orderExt = userMapper.findOrderByResultMap(ordersExt);

        System.out.println(orderExt);
    }

    @Test
    public void demo02() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
        UserMapper userMapper = (UserMapper)applicationContext.getBean("userMapper");
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(3);
        List<OrdersExt> orderExt = userMapper.findOrdersAndUserAndDetail(ordersExt);

        System.out.println(orderExt);
    }

    /**
     * @auther: dingwensheng
     * @description:懒加载
     * @date:
     */
    @Test
    public void demo04() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
        UserMapper userMapper = (UserMapper)applicationContext.getBean("userMapper");
        List<OrdersExt> orderExt = userMapper.findOrderInfoBylazyLoad(4);
        orderExt.get(0).getUser();
        System.out.println(orderExt.get(0).getUser());

    }

}
