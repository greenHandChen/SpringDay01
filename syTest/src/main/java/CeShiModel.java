import com.hand.Controller.FirstController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CeShiModel {
    @Test
    public void go(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        /*HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        */FirstController FirstController =(com.hand.Controller.FirstController) applicationContext.getBean("firstController");
        FirstController.addUser();

    }

}
