import com.hand.lq.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrTest {

    @Test
    public void tt() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        AccountService accountService = applicationContext.getBean("accountServiceProxy", AccountService.class);
        AccountService accountService1 = applicationContext.getBean("accountService", AccountService.class);
        /**
         * 声明式
         */
        //        accountService.transfer2("mabatis","hibernate",200.0);
        /**
         * 编程式
         */
//        accountService1.transfer("mabatis","hibernate",200.0);
        /**
         * 注解事务
         */
        accountService1.transfer3("mabatis", "hibernate", 200.0);

    }
}
