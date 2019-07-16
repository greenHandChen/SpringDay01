package d_lifecycle;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestLifeCycle {
    @Test
    public void test(){
//        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDemo\\src\\main\\java\\d_lifecycle\\applicationContext.xml");
        AbstractApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDemo\\src\\main\\java\\d_lifecycle\\applicationContext.xml");
        HelloSpring helloSpring= (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.service();
        //当配置的bean为默认的单例时，当应用上下文被关闭之后，bean生命周期结束被销毁
        //当配置的bean为多例时，bean生命周期不会被销毁
        applicationContext.close();
    }
}
