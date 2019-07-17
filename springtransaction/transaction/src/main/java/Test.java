import Dao.AccountDaoImpl;
import Dao.IAccountDao;
import Service.AccountServiceImpl;
import Service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.math.BigDecimal;

public class Test  {

    @org.junit.Test
    public void demo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = applicationContext.getBean("accountServiceImpl",IAccountService.class);

        accountService.transfer("mybatis","hibermate",new BigDecimal(100));

    }

    @org.junit.Test
    public void interfaceDemo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
                                                                                        //基于接口类代理所以返回类型为接口类
        IAccountService accountService = applicationContext.getBean("accountServiceImpl",IAccountService.class);
        accountService.transfer("mybatis","hibermate",new BigDecimal(100));

    }

    @org.junit.Test
    public void cglibDemo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountServiceImpl accountService = applicationContext.getBean("accountServiceImpl",AccountServiceImpl.class);

        accountService.transferBycglib("mybatis","hibermate",new BigDecimal(100));
    }
}
