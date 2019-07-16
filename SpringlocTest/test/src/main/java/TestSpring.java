import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void before(){
        HelloSpring hellSpring = new HelloSpring();
        hellSpring.setInfo("芜湖班的同学们好！");
        System.out.println(hellSpring.getInfo());
    }
    public void now(){
       /* //第一步：根据XML配置文件生产
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //第二步：根据bean的ID获取bean
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        //第三步：使用
        helloSpring.setInfo("spring:芜湖班的同学们好！");
        System.out.println(helloSpring.getInfo());
        */
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
       HelloSpring helloSpring = (HelloSpring)applicationContext.getBean("helloSpring");
        System.out.println(helloSpring.helloDI());

    }
}
