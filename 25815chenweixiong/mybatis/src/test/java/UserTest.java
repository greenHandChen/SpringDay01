import Mapper.OrderMapper;
import domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void t1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/applicationContext.xml");

        OrderMapper mapper = (OrderMapper) applicationContext.getBean("orderMapper");

//        System.out.println(mapper);
        User user =mapper.findUserById(10);

        System.out.println(user.getUsername());
    }
}
