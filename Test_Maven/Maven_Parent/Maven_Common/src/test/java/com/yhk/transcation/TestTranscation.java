package com.yhk.transcation;

import com.yhk.transcation.Service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTranscation {

    @Test
    public void Transation(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        IAccountService accountServic=applicationContext.getBean("accountServiceProxy", IAccountService.class);
        accountServic.transfer("mybatis","hibernate",100);
    }
}
