package com.Test;

import com.Service.AccountService;
import com.Service.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test {
    @Test
    public void transferTest()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\polymerize\\transaction_03\\src\\main\\resources\\applicationContext.xml");

        AccountService service=applicationContext.getBean("accountServiceImpl", AccountService.class);
        service.transfer("mybatis1","hibernate",100.0);



    }
}
