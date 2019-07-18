import com.jmx.Service.AccountServiceImpl;
import com.jmx.Service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String args[]){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_test.xml");
        AccountServiceImpl accountServiceImpl=(AccountServiceImpl) ctx.getBean("accountServiceImpl");
        accountServiceImpl.transfer("ESB","jmx",200.00);



    }
}
