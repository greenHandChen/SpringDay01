import com.transaction.Dao.IAccountDao;
import com.transaction.Service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransationTest {
    @Test
    public void testtransfer(){
        ApplicationContext appCon =new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService iAccountService=appCon.getBean("iAccountService", IAccountService.class);
        iAccountService.transfer("mybatis","hibernate",100D);
    }
}
