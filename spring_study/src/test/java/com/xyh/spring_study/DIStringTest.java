package com.xyh.spring_study;

import com.xyh.spring_studay.DIString;
import com.xyh.spring_studay.HelloString;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DIStringTest {

    @Test
    public void before() {
        HelloString helloString = new HelloString();
        DIString diString = new DIString();
        helloString.setDiString(diString);
        System.out.println(helloString.helloDIString());
    }

    @Test
    public void now() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\workspace\\spring_study\\src\\main\\java\\com\\xyh\\spring_studay\\beans.xml");
        HelloString helloString = applicationContext.getBean("helloString", HelloString.class);
        System.out.println(helloString.helloDIString());
    }

    @Test
    public void scope()
    {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\workspace\\spring_study\\src\\main\\java\\com\\xyh\\spring_studay\\beans.xml");
        DIString diString=applicationContext.getBean("diString1",DIString.class);
        DIString diString1=applicationContext.getBean("diString1",DIString.class);
        System.out.println("多例:"+diString+"   "+diString1+"   是否相等"+(diString==diString1));

        diString=applicationContext.getBean("diString2",DIString.class);
        diString1=applicationContext.getBean("diString2",DIString.class);
        System.out.println("多例:"+diString+"   "+diString1+"   是否相等"+(diString==diString1));
    }
}
