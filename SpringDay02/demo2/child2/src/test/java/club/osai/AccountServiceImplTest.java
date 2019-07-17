package club.osai;


import club.osai.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceImplTest {



    @Test
    public void transfer1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer("mybatis","hibernate", 10.0);

    }
    @Test
    public void transfer2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        AccountService accountServiceProxy = applicationContext.getBean("accountServiceProxy", AccountService.class);
        accountServiceProxy.transfer2("mybatis","hibernate", 10.0);


    }
}