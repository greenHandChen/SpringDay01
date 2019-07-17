import com.yonye.spring.transcation.facade.AccountDaoImpl;
import com.yonye.spring.transcation.serverImpl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    @org.junit.Test
    public void now() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        AccountServiceImpl accountDaoImpl = applicationContext.getBean("accountServiceImpl", AccountServiceImpl.class);
        accountDaoImpl.transfer("tom","jun",123D);

    }


}
