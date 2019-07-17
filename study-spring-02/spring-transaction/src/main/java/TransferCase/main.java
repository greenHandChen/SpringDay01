package TransferCase;

import TransferCase.Service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountService = (AccountService)ctx.getBean("accountService");

        accountService.transfer("mybatis", "hibernate", (double)1);

    }
}
