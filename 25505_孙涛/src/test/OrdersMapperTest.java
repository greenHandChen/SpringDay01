import com.sunt.mapper.OrdersMapper;
import com.sunt.po.OrdersExt;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class OrdersMapperTest {
    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }

    @Test
    public void testUserMapper() {
        OrdersMapper ordersMapper = (OrdersMapper) context.getBean("ordersMapper");
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setItemId(1);
        ordersExt.setName("电脑");
        List<OrdersExt> list= ordersMapper.findOrdersExts(ordersExt);
        System.out.println(list);
    }
}
