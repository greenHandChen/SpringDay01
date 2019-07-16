import a_ioc.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpringIOC {
    @Test
    public void test(){
        HelloSpring helloSpring=new HelloSpring();
        helloSpring.setInfo("testSpring");
        System.out.println(helloSpring.getInfo());
    }
    @Test
    public void now(){
        //第一步,加载applicationContext.xml
        //1)classpath加载
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2）fFleSystem加载
        ApplicationContext applicationContext1=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDemo\\src\\main\\resources\\applicationContext.xml");

        //第二步,通过getBean获取bean
        HelloSpring helloSpring= (HelloSpring) applicationContext.getBean("helloSpring");
        HelloSpring helloSpring1= (HelloSpring) applicationContext1.getBean("helloSpring");
        helloSpring.setInfo("hello spring a_ioc");
        helloSpring1.setInfo("hello spring1 a_ioc");
        System.out.println(helloSpring.getInfo());
        System.out.println(helloSpring1.getInfo());
    }
}
