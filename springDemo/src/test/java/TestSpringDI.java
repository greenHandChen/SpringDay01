import b_di.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDI {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloSpring helloSpringDI=applicationContext.getBean("helloSpringDI",HelloSpring.class);

        System.out.println(helloSpringDI.getDiSpring());
    }

}
