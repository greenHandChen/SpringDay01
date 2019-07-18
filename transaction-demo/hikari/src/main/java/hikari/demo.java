package hikari;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

    @Test
    public void hikari_demo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("c_hikari.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(4L);
        user.setUsername("2019/07/17");
        user.setPassword("21:01");
        userDao.update(user);

    }
}
