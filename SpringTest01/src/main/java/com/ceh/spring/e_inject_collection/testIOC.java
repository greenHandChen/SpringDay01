package com.ceh.spring.e_inject_collection;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 测试IOC
 */
public class testIOC {
    // 测试 集合注入
    @Test
    public void now() {
        // 根据beans.xml 生成Spring上下文
        // 这里相对路径有问题 用绝对路径吧
        ApplicationContext apC = new FileSystemXmlApplicationContext("C:\\Users\\75741\\IdeaProjects\\SpringDay01\\SpringTest01\\src\\main\\java\\com\\ceh\\spring\\e_inject_collection\\applicationContext.xml");
        // 根据beans中id获取相应的bean 括号内参数为id
        CollectionBean cb = apC.getBean("collection",CollectionBean.class);
        // Set 注入
        System.out.println(cb.getSet());
        // map
        System.out.println(cb.getMap());
    }


}
