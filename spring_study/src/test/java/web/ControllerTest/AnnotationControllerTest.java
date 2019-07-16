package web.ControllerTest;

import com.xyh.web.Controller.AnnotationController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AnnotationControllerTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\workspace\\spring_study\\src\\main\\java\\com\\xyh\\web\\beans.xml");
        AnnotationController annotationController = applicationContext.getBean("annotationController", AnnotationController.class);
        annotationController.addUser();
    }
}
