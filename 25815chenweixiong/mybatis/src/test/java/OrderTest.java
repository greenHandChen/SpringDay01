import Mapper.OrderMapper;
import domain.OrdersExt;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class OrderTest {

    @Test
    public void t1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/applicationContext.xml");

        OrderMapper mapper = (OrderMapper) applicationContext.getBean("orderMapper");

        OrdersExt ordersExt=new OrdersExt();

        ordersExt.setId(1);

        List<OrdersExt> list=mapper.findOrdersExts(ordersExt);

        for(OrdersExt e :list){
            System.out.println(e.getUser());
        }
    }
}
