import com.alibaba.druid.support.logging.Resources;
import com.hand.domain.User;
import com.hand.service.UserService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatisTest {

    UserService userService;
   @Before
    public void testSpringBatis(){
       ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-batis.xml");
       userService=applicationContext.getBean(UserService.class);
    }
    @Test
    public void testUser(){
       User user= userService.findUser(28);
       System.out.print(user.getUserName());
    }

}
