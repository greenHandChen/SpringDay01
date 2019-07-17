import com.hand.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = applicationContext.getBean("accountServiceImpl",AccountService.class);
        accountService.transfer("mybatis","hibernate",200.00);
        System.out.println("---转账成功---");
    }
}
