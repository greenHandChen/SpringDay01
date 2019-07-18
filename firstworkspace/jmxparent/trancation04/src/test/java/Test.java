import com.jmx.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String args[]){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_test.xml");
        IAccountService accountServiceImpl=ctx.getBean("accountServiceProxy", IAccountService.class);
        accountServiceImpl.transfer("ESB","jmx",200.00);



    }
}
