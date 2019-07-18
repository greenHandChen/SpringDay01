package transaction.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import transaction.service.IAccountServiceImpl;

public class Test {


    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAccountServiceImpl accountService = applicationContext.getBean(IAccountServiceImpl.class);
        accountService.transfer("mybatis","hibernate",200.0);
    }
}
