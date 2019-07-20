import com.hph.dao.OrderMapper;
import com.hph.entity.OrderExt;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void demo() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderMapper orderMapper = (OrderMapper) applicationContext.getBean("userMapper");
        OrderExt orderExt = new OrderExt();
        orderExt.setName("王五");
        System.out.println(orderMapper.findOrderExt(orderExt).get(0));
    }
}
