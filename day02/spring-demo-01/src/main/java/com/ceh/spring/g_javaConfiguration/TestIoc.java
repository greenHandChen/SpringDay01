package com.ceh.spring.g_javaConfiguration;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
public class TestIoc {
    @Test
    public void now(){
        // 第一步加载applicationContext
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\芜湖培训\\spring\\day01\\培训内容\\test\\spring-demo-01\\src\\main\\java\\com\\ceh\\spring\\g_javaConfiguration\\applicationContext.xml");
        // 第二步通过getBean获取bean
        Person person =  applicationContext.getBean("personP", Person.class);
        System.out.println(person);
    }
}
