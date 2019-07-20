import com.masirhh.finalpro.beans.OrdersExt;
import com.masirhh.finalpro.mappers.OrdersMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    private ApplicationContext applicationContext;
    @Before
    public void setup() throws Exception {
        applicationContext = new
                ClassPathXmlApplicationContext("config/applicationContext.xml");
    }


    @Test
    public void test2(){
        OrdersMapper ordersMapper=(OrdersMapper) applicationContext.getBean("OrdersMapper");
//        OrdersExt ordersExt=ordersMapper.findOrdersExts();
//        System.out.println(userBean.toString());
    }

}
