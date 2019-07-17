package springMVC.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springMVC.Controller.UserController;
import springMVC.Entity.User;

public class main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc-config.xml");

        User user = (User)ctx.getBean("user");

        user.setId((long)1);

        user.setUsername("25573");
        user.setPassword("25573");

        UserController userController = (UserController)ctx.getBean("userController");

        userController.signUpAction(user);


    }
}
