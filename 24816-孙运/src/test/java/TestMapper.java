import com.sy.bean.Items;
import com.sy.bean.Orders;
import com.sy.bean.OrdersExt;
import com.sy.mapper.OrderExtMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMapper {

    @Test
    public void testFindOrdersExts(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/SpringBeanConfig.xml");
        OrderExtMapper orderExtMapper =(OrderExtMapper) applicationContext.getBean("orderExtMapper");
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setNumber("1000010");
        Items items=new Items();
        items.setName("笔记本");
        ordersExt.setItems(items);
        orderExtMapper.findOrdersExts(ordersExt);
    }
}
