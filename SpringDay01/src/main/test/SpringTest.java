import com.demo.spring.HelloClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest{
    @Test
    public void testSpring(){
        ApplicationContext abstractApplicationContext= new ClassPathXmlApplicationContext("beans.xml");
        HelloClass helloClass=(HelloClass)abstractApplicationContext.getBean("hellospring");
        System.out.println(helloClass.getInfo());
    }
}