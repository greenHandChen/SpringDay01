import com.zt.demo.service.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.math.BigDecimal;

public class TestTransaction {

    @Test
    public void testDemo() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\polymerize\\transaction_02\\src\\main\\resources\\applicationContext.xml");
        AccountServiceImpl accountServiceImpl = applicationContext.getBean("accountServiceImpl", AccountServiceImpl.class);
        accountServiceImpl.transfer("hibernate", "mybatis", BigDecimal.valueOf(100));
    }
}
