import com.hand.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserController {

    @Test
    public void test() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.addUser();
    }
}
