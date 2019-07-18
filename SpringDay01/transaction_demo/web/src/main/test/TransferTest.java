import com.hand.trans.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransferTest {
    @Test
    public void transferTest(){
        ApplicationContext abstractApplicationContext= new ClassPathXmlApplicationContext("web/src/main/resource/applicationContext.xml");
        IAccountService IAccountServiceImpl=abstractApplicationContext.getBean("accountServiceProxy", IAccountService.class);
        IAccountServiceImpl.transfer("mybatis","hibernate",100D);
    }
}
