import com.hand.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {
    @Test
    public void transactionTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Transaction.xml");
        IAccountService iAccountService=applicationContext.getBean("accountService",IAccountService.class);
        iAccountService.transfer("mybatis","hibernate",100D);
    }
}
