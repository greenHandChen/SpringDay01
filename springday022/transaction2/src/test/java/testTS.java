import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountServiceImpl;

public class testTS {
    @Test
    public void testJDSUserDao(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
        AccountServiceImpl accountService = applicationContext.getBean("accountServiceImpl",AccountServiceImpl.class);
        accountService.transfer("1","2",100d);

    }
}
