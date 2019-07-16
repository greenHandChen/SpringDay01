package huanglehao.study.d_scope_singleton_prototype;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {


    @Test
    public void now(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\办公软件\\IDEAWorkSpace\\studyGitAndSpring\\src\\test\\java\\huanglehao\\study\\d_scope_singleton_prototype\\beans.xml");
        HelloSpring helloSpring1=(HelloSpring) applicationContext.getBean("helloSpring");
        HelloSpring helloSpring2=(HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(helloSpring1);
        System.out.println(helloSpring2);
    }


}
