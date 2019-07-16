package MavenTest.spring.e_setter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    @Test
    public void now(){
        //1.根据XML配置，生成上下文
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("E:\\IdeaProjects\\MavenTest\\src\\main\\java\\MavenTest\\spring\\e_setter\\application.xml");
        //2.根据bean的ID获取bean
        Person person=(Person) applicationContext.getBean("person");

        System.out.println(person.toString());

    }
}
