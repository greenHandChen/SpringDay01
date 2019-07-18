package d_druid;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

    @Test
    public void druid_demo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("druid.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao",UserDao.class);
        User user = new User();
        user.setId(3L);
        user.setUsername("2019/07/17");
        user.setPassword("20:53");
        userDao.update(user);

    }
}
