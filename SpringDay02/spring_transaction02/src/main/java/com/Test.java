package com;

import com.hand.service.AcountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public void test_Trans(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        AcountService acountService= applicationContext.getBean("accountServiceProxy", AcountService.class);
        acountService.transfer("mybatis","hibernate",500);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test_Trans();
    }
}
