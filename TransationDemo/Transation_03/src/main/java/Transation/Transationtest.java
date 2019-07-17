package Transation;

import Transation.TransationService.AccountServiceImpl;
import Transation.TransationService.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;


public class Transationtest {
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountServiceImpl accountService = applicationContext.getBean("accountServiceImpl",AccountServiceImpl.class);
        accountService.transfer("hibernate","mybatis",new BigDecimal(100));

    }
}
