import com.yonye.mybatis.mapper.OrdersExtMapper;
import com.yonye.mybatis.pojo.OrdersExt;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Yonye
 * @Date:2019/7/20 15:40
 * @Version:1.0
 * @deseription:
 **/
public class TestDemo {
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-context.xml");
    @Test
    public void test(){

        OrdersExtMapper usersMapper=applicationContext.getBean("ordersExtMapper",OrdersExtMapper.class);

       usersMapper.selectTest();
        System.out.println(usersMapper.findOrdersExts(new OrdersExt()));
    }
}
