package huanglehao.study.a_ioc_bean_xml;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {


    @Test
    public void before(){
        HelloSpring helloSpring =new HelloSpring();
        helloSpring.setInfo("芜湖班的同学们好！");
        System.out.println(helloSpring.getInfo());

    }

    @Test
    public void now(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\办公软件\\IDEAWorkSpace\\studyGitAndSpring\\src\\test\\java\\huanglehao\\study\\a_ioc_bean_xml\\beans.xml");
        HelloSpring helloSpring=(HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("Spring:芜湖班的同学们好！");
        System.out.println(helloSpring.getInfo());
    }


}
