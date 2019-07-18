package com.hand.web;

import com.hand.service.AccountServiceImpl;
import com.hand.service.IAccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HuangHeng on 2019/7/17
 */
public class TestWeb {
    /**
     * @author:  HuangHeng
     * @description  测试转账
     * @CreateDate:  2019/7/17
     */
    @Test
    public void testDemo(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        IAccountService accountServiceImpl = ctx.getBean("accountServiceProxy", IAccountService.class);
        try {
            accountServiceImpl.transfer("hibernate","mybatis",111);
            System.out.println("SUCCESS");
        }catch (Exception e){
            System.out.println("FAIl--->"+e.getMessage());
        }
    }
}
