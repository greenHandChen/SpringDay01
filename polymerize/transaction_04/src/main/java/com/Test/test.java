package com.Test;

import com.Service.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test {
    @Test
    public void demo()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\polymerize\\transaction_01\\src\\main\\resources\\applicationContext.xml");

        AccountServiceImpl service=(AccountServiceImpl)applicationContext.getBean("accountServiceImpl");
        service.transfer("mybatis1","hibernate",100.0);



    }
}
