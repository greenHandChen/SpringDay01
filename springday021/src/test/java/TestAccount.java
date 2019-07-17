import com.softeem.Service.AccountService;
import com.softeem.Service.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAccount {

   // private AccountService accountService;

   @Test
    public void demo1(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       AccountService accountService = applicationContext.getBean("accountService", AccountServiceImpl.class);
        accountService.transfer("王思聪","马云",888);
   }

}
