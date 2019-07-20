import com.hand.entity.OrdersExt;
import com.hand.entity.User;
import com.hand.mapper.OrdersMapper;
import com.hand.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void testUserMapper(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.finUserById(10);
        System.out.println(user.getUsername());
    }

    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        OrdersMapper ordersMapper = (OrdersMapper) applicationContext.getBean("ordersMapper");
        OrdersExt ordersExt = new OrdersExt();
    }
}
