package spring.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.Entity.User;

public class main {

    public static void main(String[] args) {

        // 1. 原始方法
        // User user = new User();


        // 2. 使用spring实现依赖注入

        // (a). 创建spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        // (b). 通过spring容器去除对象
        User user = (User)ctx.getBean("user", User.class);

        user.setUsername("25573");
        user.setPassword("12345");

        user.getAllInfo();

    }
}
