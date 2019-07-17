package Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        User user=new User();
        user.setId(1);
        user.setUsername("2019/7/5");
        user.setPassword("15.14");
        userDao.update(user);
    }

    @Test
    public void demo02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao1 userDao1=applicationContext.getBean("userDao1",UserDao1.class);
        User user=new User();
        user.setId(2);
        user.setUsername("222");
        user.setPassword("2222");
        userDao1.update(user);
    }

}
