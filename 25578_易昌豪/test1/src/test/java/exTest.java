import domain.OrdersExt;
import domain.User;
import mapper.OrdersMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class exTest {
    private ApplicationContext applicationContext;
    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }

    @Test
    public void demo(){
        OrdersMapper ordersMapper = (OrdersMapper) applicationContext.getBean("orderMapper");
        OrdersExt ordersExt = new OrdersExt();
        ordersMapper.findOrdersExt(ordersExt);
    }
}
