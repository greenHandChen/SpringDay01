package com.ceh.spring.d_lifeCycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 测试IOC
 */
public class testIOC {
    // 测试 生命周期 lifecycle
    @Test
    public void now() {
        // 根据beans.xml 生成Spring上下文
        // 用绝对路径吧
        AbstractApplicationContext apC = new FileSystemXmlApplicationContext("C:\\Users\\75741\\IdeaProjects\\SpringDay01\\SpringTest01\\src\\main\\java\\com\\ceh\\spring\\d_lifeCycle\\applicationContext.xml");
        // 根据beans中id获取相应的bean 括号内参数为id
        HelloSpring hp = (HelloSpring) apC.getBean("helloSpring",HelloSpring.class);
        hp.service();
        // destroy 先close
        apC.close();
    }


}
