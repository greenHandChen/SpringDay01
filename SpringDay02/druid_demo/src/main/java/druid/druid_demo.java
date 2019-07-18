package druid;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class druid_demo {

    @Test
    public void demo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("druid.xml");
        UserDao_jds userDao_jds = (UserDao_jds) applicationContext.getBean("userDao_jds");
        User user = new User();
        user.setId(8L);
//        user.setUsername("turing");
//        user.setPassword("handhand");
//        System.out.println(userDao_jds.getUserById(user));
        System.out.println(userDao_jds.getUsers());
    }
}
