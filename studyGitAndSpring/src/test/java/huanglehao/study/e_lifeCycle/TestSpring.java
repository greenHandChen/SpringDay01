package huanglehao.study.e_lifeCycle;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {


    @Test
    public void now(){
        FileSystemXmlApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\办公软件\\IDEAWorkSpace\\studyGitAndSpring\\src\\test\\java\\huanglehao\\study\\e_lifeCycle\\beans.xml");
        HelloSpring helloSpring=(HelloSpring) applicationContext.getBean("helloSpring");
        MyBeanPostProcessor myBeanPostProcessor=(MyBeanPostProcessor)applicationContext.getBean("myBeanPostProcessor");
        applicationContext.close();
    }


}
