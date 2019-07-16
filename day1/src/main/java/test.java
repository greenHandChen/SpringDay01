import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void tt() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("hello");
        HelloSpring helloSpring1 = (HelloSpring) applicationContext.getBean("hello");
        HelloSpring2 helloSpring2 = (HelloSpring2) applicationContext.getBean("hello2");
        HelloSpring3 helloSpring3 = (HelloSpring3) applicationContext.getBean("hello3");
        HelloSpring3 helloSpring31 = (HelloSpring3) applicationContext.getBean("hello3");
        System.out.println("构造函数注入 " + helloSpring.toString());
        System.out.println("属性注入 " + helloSpring2.toString());
        System.out.println("注解注入 " + helloSpring3.toString());
        System.out.println("单例模式 " + helloSpring.equals(helloSpring1));
        System.out.println("多例模式 " + helloSpring3.equals(helloSpring31));
    }


}
