package spring_day02.spring.b_hikari;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import spring_day02.spring.pojo.User;

public class HikariTest {

    @Test
    public void demo01(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\Springday2\\src\\main\\java\\spring_day02\\spring\\b_hikari\\applicationConfig.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User user=new User();
        user.setId(1);
        user.setUsername("hrib");
        user.setPassword("2321");
        userDao.update(user);
    }

    @Test
    public void demo02(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\Springday2\\src\\main\\java\\spring_day02\\spring\\b_hikari\\applicationConfig.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User user=new User();
        user.setId(3);
        userDao.delete(user);
    }
}
