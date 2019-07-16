package huanglehao.study.b_bean_property;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    @Test
    public void now(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\办公软件\\IDEAWorkSpace\\studyGitAndSpring\\src\\test\\java\\huanglehao\\study\\b_bean_property\\beans.xml");
        HelloSpring helloSpring=(HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(helloSpring.getDiSpring().getHelloDI());
    }

    
}
