package com.ceh.spring.b_di;


import com.ceh.spring.c_scope.HelloSpring;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 测试IOC
 */
public class testDI {
    @Test
    public void now(){
        ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\75741\\IdeaProjects\\SpringDay01\\SpringTest01\\src\\main\\java\\com\\ceh\\spring\\b_di\\applicationContext.xml");
        DiSpring hs = (DiSpring)ac.getBean("diSpring");
        // DI 依赖注入
        hs.helloDI("hello spring di");

    }
}
