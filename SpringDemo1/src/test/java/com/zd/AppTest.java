package com.zd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }

    @Test
    public void now(){
        //根据xml配置文件生成，spring上下文
        ApplicationContext app = new ClassPathXmlApplicationContext("springConfig.xml");
        //根据bean的id获取bean
        HelloSpring helloSpring = (HelloSpring) app.getBean("helloSpring");
        //使用对象
        helloSpring.setInfo("zoudeng");
        System.out.println(helloSpring.getInfo());
    }
}
