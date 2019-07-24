import domain.OrdersExt;
import domain.User;
import mapper.OrdersMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class exTest {
    private ApplicationContext applicationContext;
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }

    @Test
    public void demo(){
        OrdersMapper ordersMapper = (OrdersMapper) applicationContext.getBean("ordersMapper");
        OrdersExt ordersExt = new OrdersExt();
//        ordersExt.setNumber("1000010");
        ordersExt.setName("笔记本");
        List<OrdersExt> ordersExts = ordersMapper.findOrdersExt(ordersExt);
        ordersExts.get(0).getUser();
        System.out.println(ordersExts);
    }
}
