package f_annotation.lifecycle;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestLifeCycle {
    @Test
    public void test(){
//        ApplicationContext applicati
//        onContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDemo\\src\\main\\java\\d_lifecycle\\applicationContext.xml");
        AbstractApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\SpringDay01\\springDemo\\src\\main\\java\\f_annotation\\lifecycle\\applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");

        person.service();
        //当配置的bean为默认的单例时，当应用上下文被关闭之后，bean生命周期结束被销毁
        //当配置的bean为多例时，bean生命周期不会被销毁
        applicationContext.close();
    }
}
