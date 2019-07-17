package Transaction.Service.impl;

import Transaction.Service.IAcountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ServiceImplTest {

    @Test
    public void ServiceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAcountServiceImpl iAcountService = (IAcountServiceImpl) context.getBean("IAcountServiceImpl", IAcountService.class);
        iAcountService.transfer("hibernate","mybatis", BigDecimal.valueOf(100));
    }

}