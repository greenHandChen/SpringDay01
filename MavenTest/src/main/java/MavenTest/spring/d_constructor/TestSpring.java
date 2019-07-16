package MavenTest.spring.d_constructor;

import MavenTest.spring.d_constructor.TestSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    @Test
    public void now(){
        //第一步：根据xml配置生成，spring上下文
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\MavenTest\\src\\main\\java\\MavenTest\\spring\\d_constructor\\application.xml");
        //第二步：根据bean的id获取bean
        Person person= (Person) applicationContext.getBean("person");
        //第三步：使用
       System.out.println(person.toString());
    }
}
