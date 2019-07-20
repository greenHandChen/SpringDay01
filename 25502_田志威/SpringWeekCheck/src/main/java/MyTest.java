import Domin.OrdersExt;
import Mapper.OrdersExtMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void demo(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");

        OrdersExtMapper ordersExtMapper = applicationContext.getBean("ordersExtMapper",OrdersExtMapper.class);

        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setNumber("1000010");
        List<OrdersExt> ordersExts =  ordersExtMapper.findOrdersExts(ordersExt);

        System.out.println(ordersExts.get(0).toString());
    }
}
