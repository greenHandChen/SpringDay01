package huanglehao.study.f_constructor.arg;


import huanglehao.study.a_ioc_bean_xml.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {


    @Test
    public void now(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\办公软件\\IDEAWorkSpace\\studyGitAndSpring\\src\\test\\java\\huanglehao\\study\\f_constructor\\arg\\beans.xml");
        Person person=(Person)applicationContext.getBean("person");
        System.out.println(person);
    }


}
