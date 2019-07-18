package transaction.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import transaction.service.IAccountService;

public class Test {


    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAccountService accountService = applicationContext.getBean("accountServiceProxy", IAccountService.class);
        accountService.transfer("mybatis","hibernate",200.0);
    }
}
