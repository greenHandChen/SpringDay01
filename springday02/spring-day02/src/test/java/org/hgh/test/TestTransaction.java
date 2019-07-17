package org.hgh.test;

import org.hgh.demo.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTransaction {
    @Qualifier("accountServiceImpl")
    @Autowired
    private IAccountService accountService;

    @Autowired
    @Qualifier("accountServiceForFactoryImpl")
    private IAccountService accountServiceForFactory;

    @Autowired
    @Qualifier("accountServiceForAnnotationImpl")
    private IAccountService accountServiceForAnnotation;

    @Test
    public void testAccount(){
        accountService.transfer("mybatis","hibernate", BigDecimal.valueOf(500));
    }

    @Test
    public void testAccountForTransactionFactory(){
        accountServiceForFactory.transfer("mybatis","hibernate", BigDecimal.valueOf(500));
    }

    @Test
    public void testAccountForAnnotation(){
        accountServiceForAnnotation.transfer("mybatis","hibernate", BigDecimal.valueOf(500));
    }
}
