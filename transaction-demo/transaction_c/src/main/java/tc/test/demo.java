package tc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tc.service.IAccountService;

import java.math.BigDecimal;

public class demo {

    @Test
    public void demo_transaction(){
        System.out.println("transaction in c");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("transaction_c.xml");
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
        accountService.transfer("hibernate","mybatis",Double.parseDouble(BigDecimal.valueOf(100).toString()));
    }
}
