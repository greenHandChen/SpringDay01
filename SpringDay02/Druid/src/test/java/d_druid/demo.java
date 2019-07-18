package d_druid;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

    private Logger logger = LoggerFactory.getLogger(demo.class);

    @Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("druid.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(4L);
        user.setUsername("2019/07/17");
        user.setPassword("17:00");
        System.out.println(user.toString());
        userDao.delete(user);

    }
}
