package com.ceh.spring.c_scope;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 测试IOC
 */
public class testIOC {
    // 测试作用域 scope
    @Test
    public void now() {
        // 根据beans.xml 生成Spring上下文
        // 这里路径有问题 用绝对路径吧
        ApplicationContext apC = new FileSystemXmlApplicationContext("C:\\Users\\75741\\IdeaProjects\\SpringDay01\\SpringTest01\\src\\main\\java\\com\\ceh\\spring\\c_scope\\applicationContext.xml");
        // 根据beans中id获取相应的bean 括号内参数为id
        HelloSpring hp = (HelloSpring) apC.getBean("helloSpring");
        HelloSpring hp1 = (HelloSpring) apC.getBean("helloSpring");

        hp.setInfo("test1");
        System.out.println(hp.getInfo());
        System.out.println(hp1.getInfo());
    }


}
