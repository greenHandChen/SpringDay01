package e_inject.constructor;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestConstructot {
    @Test
    public void test(){
        AbstractApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDemo\\src\\main\\java\\e_inject\\constructor\\applicationContext.xml");
        Person person= (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
