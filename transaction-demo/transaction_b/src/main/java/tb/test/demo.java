package tb.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tb.service.IAccountService;

import java.math.BigDecimal;

public class demo {

    @Test
    public void demo_transaction(){

        System.out.println("transaction in b");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("transaction_b.xml");
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountServiceProxy",IAccountService.class);
        accountService.transfer("hibernate","mybatis",Double.parseDouble(BigDecimal.valueOf(100).toString()));

    }
}
