package com.ljx.spring_transaction.test;

import com.ljx.service.IAccountService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *功能描述  AOP配置事务基于注解
 * @author LJX
 * @date 2019/7/17 22:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-service02.xml", "classpath*:applicationContext-dao.xml"})
public class Test02 {

    @Autowired
    private IAccountService accountService;

    @org.junit.Test
    public void transfer() {

        accountService.transfer("mybatis","hibernate",1.0);
        System.out.println("dd");
    }
}
