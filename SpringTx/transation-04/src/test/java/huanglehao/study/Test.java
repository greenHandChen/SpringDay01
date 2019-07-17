package huanglehao.study;

import huanglehao.study.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        IAccountService iAccountService=applicationContext.getBean("accountService",IAccountService.class);
        iAccountService.transfer("mybatis","hibernate", 100);

    }
}
