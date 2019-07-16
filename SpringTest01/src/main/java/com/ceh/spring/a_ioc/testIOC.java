package com.ceh.spring.a_ioc;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 测试IOC
 */
public class testIOC {
    @Test
    public void before() {
        HelloSpring hp = new HelloSpring();
        hp.setInfo("testIOC");
        System.out.println(hp.getInfo());
    }

    @Test
    public void now() {
        // 根据beans.xml 生成Spring上下文 apC
        // 这里使用了绝对路径
        /**
         * 加载相对路径：ClassPathXmlApplicationContext()
         * 加载绝对路径：FileSystemXmlApplicationContext()
         */
        ApplicationContext apC = new FileSystemXmlApplicationContext("C:\\Users\\75741\\IdeaProjects\\SpringDay01\\SpringTest01\\src\\main\\java\\com\\ceh\\spring\\a_ioc\\applicationContext.xml");
        // 通过getBean获取Spring容器中的对象 helloSpring
        HelloSpring  hp = (HelloSpring) apC.getBean("helloSpring");
        // 调用
        hp.setInfo("testIOC QuickStart");
        System.out.println(hp.getInfo());
    }


}
