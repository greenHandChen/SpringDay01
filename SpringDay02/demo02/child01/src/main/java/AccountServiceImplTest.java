import club.osai.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceImplTest {



  @Test
    public void transfer() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:*jdbc.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer("mybatis","hibernate", 10.0);

    }
}