package com.ljx.spring_transaction.test;

import com.ljx.service.IAccountService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 18:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-service.xml", "classpath*:applicationContext-dao.xml"})
public class Test {

    @Autowired
    private IAccountService accountService;

    @org.junit.Test
    public void transfer() {

        accountService.transfer("mybatis","hibernate",1.0);
        System.out.println("dd");
    }
}
