package ta.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ta.service.IAccountService;

import java.math.BigDecimal;

public class demo {

    @Test
    public void demo_transaction(){
        System.out.println("transaction in a");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("transaction_a.xml");
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
        accountService.transfer("hibernate","mybatis",Double.parseDouble(BigDecimal.valueOf(100).toString()));
    }
}
