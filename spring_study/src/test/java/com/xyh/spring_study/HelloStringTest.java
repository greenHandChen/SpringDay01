package com.xyh.spring_study;

import com.xyh.spring_studay.HelloString;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloStringTest {

    @Test
    public void before()
    {
        HelloString helloString=new HelloString();
        helloString.setInfo("123");
        System.out.println(helloString.getInfo());
    }

    @Test
    public void now()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\workspace\\spring_study\\src\\main\\java\\com\\xyh\\spring_studay\\beans.xml");
        HelloString helloString=applicationContext.getBean("helloString",HelloString.class );
        helloString.setInfo("注入");
        System.out.println(helloString.getInfo());
    }

    @Test
    public void testInitAndDestroy()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\workspace\\spring_study\\src\\main\\java\\com\\xyh\\spring_studay\\beans.xml");
        HelloString helloString=applicationContext.getBean("helloString",HelloString.class );
        System.out.println("准备关闭");
        ((FileSystemXmlApplicationContext)applicationContext).close();
    }

    @Test
    public void testBeanPostProcessor()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\workspace\\spring_study\\src\\main\\java\\com\\xyh\\spring_studay\\beans.xml");
    }
}
