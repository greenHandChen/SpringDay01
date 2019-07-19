import com.masirhh.mybatis2.service.userService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        userService userService = ctx.getBean(userService.class);
        System.out.println(userService.getUserById(10));
    }

}
