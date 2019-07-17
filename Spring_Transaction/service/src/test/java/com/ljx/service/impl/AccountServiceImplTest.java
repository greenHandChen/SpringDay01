package com.ljx.service.impl;

import com.ljx.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 21:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-service.xml", "classpath*:applicationContext-dao.xml"})
public class AccountServiceImplTest {

    @Autowired
    private IAccountService accountService;
    @Test
    public void transfer() {

        accountService.transfer("mybatis","hibernate",1.0);
        System.out.println("dd");
    }
}