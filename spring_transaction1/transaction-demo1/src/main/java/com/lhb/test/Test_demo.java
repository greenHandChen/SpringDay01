package com.lhb.test;

import com.lhb.service.IAccountService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created By LHB on 2019/7/17;
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test_demo {
    @Autowired
    private IAccountService as;


    @Test
    public void account(){
        as.transfer("zhangsan","lisi",100.00);
    }



}
