package com.masirhh;

import com.masirhh.dao.AccountDao;
import com.masirhh.service.IAcountService;
import com.masirhh.service.IAcountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class test {


    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        IAcountService iAcountService=applicationContext.getBean(IAcountService.class);
        iAcountService.tansfer("mybatis","hibernate",new BigDecimal(100));
    }
}
