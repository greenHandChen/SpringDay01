import Service.AccountService;
import Service.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class demo4Test {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountServiceImpl accountService = applicationContext.getBean("accountServiceImpl",AccountServiceImpl.class);
//        AccountServiceImpl accountService = (AccountServiceImpl) applicationContext.getBean("accountServiceImpl");
        accountService.transfer("mybatis", "hibernate", BigDecimal.valueOf(100));
    }
}
