package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {

        // 1.创建spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("benas.xml");

        // 2.根据id从容器中取出对象
        User user = (User)ctx.getBean("user", User.class);

        user.setUsername("25573");
        user.setPassword("12345");

        user.getAllInfo();

    }
}
