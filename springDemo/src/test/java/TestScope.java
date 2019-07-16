import a_ioc.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestScope {
    @Test
    public void test(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDemo\\src\\main\\java\\c_scpoe\\applicationContext.xml");

        HelloSpring helloSpring= (HelloSpring) applicationContext.getBean("helloSpring");
        HelloSpring helloSpring1= (HelloSpring) applicationContext.getBean("helloSpring");
        //1）当配置scpoe为singleton时，为单例
        //2）当配置scpoe为prototype时，为多例
        System.out.println(helloSpring);
        System.out.println(helloSpring1);
    }

}
