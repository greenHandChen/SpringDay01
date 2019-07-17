import com.hand.wqw.service.IAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {

    /**
     * Spring编程式事务管理测试
     */
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = applicationContext.getBean("accountService", IAccountService.class);
        accountService.transfer("mybatis", "hibernate",100.0);
    }

    /**
     * Srping声明式事务管理原始方法测试
     */
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = applicationContext.getBean("accountServiceProxy", IAccountService.class);
        accountService.transferProxy("mybatis", "hibernate",100.0);
    }

    /**
     * Spring声明式事务管理AOP注解测试
     */
    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = applicationContext.getBean("accountService", IAccountService.class);
        accountService.transferAOP("mybatis", "hibernate",100.0);
    }
}
