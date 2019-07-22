package com.ceh.spring.e_inject.constructor;

import com.ceh.spring.d_lifeCycle.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
public class TestIoc {
    @Test
    public void now(){
        // 第一步加载applicationContext
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\芜湖培训\\spring\\day01\\培训内容\\test\\spring-demo-01\\src\\main\\java\\com\\ceh\\spring\\e_inject\\applicationContext.xml");
        // 第二步通过getBean获取bean
        Person person =  applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
