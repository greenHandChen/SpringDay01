package springDay02.demo2.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springDay02.demo2.service.IAccountService;

import static org.junit.Assert.*;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
public class AccountServiceImplTest {
    @Test
    public void transfer() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo2.xml");
        IAccountService accuntServiceProxy = applicationContext.getBean("accuntServiceProxy", IAccountService.class);

        accuntServiceProxy.transfer("mybatis","hibernate",100D);

    }

}