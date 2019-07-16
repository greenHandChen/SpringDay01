import com.hgh.spring.ioc.bean.config.MainConfig;
import com.hgh.spring.ioc.bean.test_Annotation.Person;
import com.hgh.spring.ioc.controller.AnnotationController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] o = applicationContext.getBeanDefinitionNames();
        for(String s : o){
            System.out.println(s);
        }
        Person person = (Person) applicationContext.getBean("person1");
        person.sayHallo();
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] o = applicationContext.getBeanDefinitionNames();
        for(String s : o){
            System.out.println(s);
        }
        AnnotationController a = (AnnotationController) applicationContext.getBean("annotationController");
        a.addUser();
    }

}
