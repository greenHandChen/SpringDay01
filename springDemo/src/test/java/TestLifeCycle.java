import d_lifecycle.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestLifeCycle {
    @Test
    public void test(){
//        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDemo\\src\\main\\java\\d_lifecycle\\applicationContext.xml");
        AbstractApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDemo\\src\\main\\java\\d_lifecycle\\applicationContext.xml");
        HelloSpring helloSpring= (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.service();
        applicationContext.close();
    }
}
