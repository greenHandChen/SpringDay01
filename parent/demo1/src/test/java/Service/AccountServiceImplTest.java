package Service;

import Dao.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AccountServiceImplTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountServiceImpl accountService = (AccountServiceImpl) applicationContext.getBean("accountServiceImpl");
        accountService.transfer("mybatis", "hibernate", BigDecimal.valueOf(100));
    }
}