package web.ControllerTest;

import com.xyh.web.Service.AnnotationService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class AnnotationServiceTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\workspace\\spring_study\\src\\main\\java\\com\\xyh\\web\\beans.xml");
        AnnotationService annotationService = applicationContext.getBean("annotationService1", AnnotationService.class);
        annotationService.addUser();
    }

    @Test
    public void scope()
    {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\workspace\\spring_study\\src\\main\\java\\com\\xyh\\web\\beans.xml");
        AnnotationService annotationService = applicationContext.getBean("annotationService1", AnnotationService.class);
        AnnotationService annotationService1 = applicationContext.getBean("annotationService1", AnnotationService.class);

        System.out.println("单例:annotationService和annotationService1是否相等"+(annotationService==annotationService1));

        annotationService = applicationContext.getBean("annotationService2", AnnotationService.class);
        annotationService1 = applicationContext.getBean("annotationService2", AnnotationService.class);
        System.out.println("多例:annotationService和annotationService1是否相等"+(annotationService==annotationService1));

    }
}
