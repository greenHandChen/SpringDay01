import com.hand.service.AcountService;
import com.hand.service.AcountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Transaction {
    @Test
    public void test_Trans(){

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        AcountService acountService= applicationContext.getBean("accountServiceProxy", AcountService.class);
        acountService.transfer("mybatis","hibernate",500);
    }
}
