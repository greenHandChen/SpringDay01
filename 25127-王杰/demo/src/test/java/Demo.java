import com.domain.OrdersExt;
import com.mapper.OrdersExtMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by wangjie_fourth on 2019/7/20.
 */
public class Demo {

    @Test
    public void test01(){
        OrdersExt ordersExt = new OrdersExt();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        OrdersExtMapper ordersExtMapper = applicationContext.getBean("ordersExtMapper", OrdersExtMapper.class);

        List<OrdersExt> ordersExts = ordersExtMapper.findOrdersExts(ordersExt);

        ordersExts.get(0).getUser();

    }
}
