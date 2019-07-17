import com.yonye.spring.transcation.template.server.IAccountService;
import com.yonye.spring.transcation.template.serverImpl.AccountAOPTranImpl;
import com.yonye.spring.transcation.template.serverImpl.AccountServiceImpl;
import com.yonye.spring.transcation.template.serverImpl.AccountTranImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransaction {
    @Test
    public void now(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        AccountServiceImpl accountDaoImpl = applicationContext.getBean("accountServiceImpl", AccountServiceImpl.class);
        accountDaoImpl.transfer("tom","jun",123D);
    }

    @Test
    public void transactionTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");

        //代理类是基于接口生成，需要目标类的接口类型
        IAccountService accountServiceTran = applicationContext.getBean("accountServiceProxy", IAccountService.class);
        accountServiceTran.transfer("tom","jun",123D);
    }


    @Test
    public void transactionAOPTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        AccountAOPTranImpl accountDaoImpl = applicationContext.getBean("accountAOPTranImpl", AccountAOPTranImpl.class);
        accountDaoImpl.transfer("tom","jun",123D);
    }
}
