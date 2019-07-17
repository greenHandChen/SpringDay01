package hand_china;


import hand_china.beans.HelloSpring;
import hand_china.beans.HelloSpring1;
import hand_china.beans.Student;
import hand_china.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    /**
     * 基于xml配置
     */
    @Test
    public void test(){
        System.out.println( "Hello World!");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring = applicationContext.getBean("helloSpring", HelloSpring.class);
        System.out.println("构造函数注入："+helloSpring.getInfo());

        HelloSpring1 helloSpring1 = applicationContext.getBean("helloSpring1", HelloSpring1.class);
        System.out.println("属性注入："+helloSpring1.getInfo());

        HelloSpring hs = applicationContext.getBean("helloSpring", HelloSpring.class);
        System.out.println("HelloSpring是多例模式："+(helloSpring==hs));
    }


    /**
     * 基于注解配置
     */
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentController = applicationContext.getBean("studentController", StudentController.class);
        Student s = studentController.add("张三", 20);
        System.out.println("service通过注解注入："+s);

    }

}