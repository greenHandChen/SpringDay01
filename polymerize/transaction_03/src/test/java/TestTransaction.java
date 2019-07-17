import com.zt.demo.service.AccountServiceImpl;
import com.zt.demo.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.math.BigDecimal;

public class TestTransaction {

    @Test
    public void testDemo() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\polymerize\\transaction_03\\src\\main\\resources\\applicationContext.xml");
        IAccountService accountService = applicationContext.getBean("accountProxyService", IAccountService.class);
        accountService.transfer("hibernate", "mybatis", BigDecimal.valueOf(100));
    }
}
