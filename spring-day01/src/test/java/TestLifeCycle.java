import com.hgh.spring.ioc.HelloSpring;
import com.hgh.spring.ioc.bean.collection_bean.CollectionBean;
import com.hgh.spring.ioc.bean.collection_bean.MapBean;
import com.hgh.spring.ioc.bean.collection_bean.SetBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestLifeCycle {
    @Test
    public void Test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hgh/spring/ioc/applicationContext.xml");
        HelloSpring h = (HelloSpring) applicationContext.getBean("helloSpring2");
        System.out.println(h);
    }

    @Test
    public void Test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hgh/spring/ioc/applicationContext.xml");
        CollectionBean c = (CollectionBean) applicationContext.getBean("collection_bean");
        System.out.println(c);
    }

    @Test
    public void testSet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hgh/spring/ioc/applicationContext.xml");
        SetBean c = (SetBean) applicationContext.getBean("set_bean");
        System.out.println(c);
    }

    @Test
    public void testMap(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hgh/spring/ioc/applicationContext.xml");
        MapBean c = (MapBean) applicationContext.getBean("map_bean");
        System.out.println(c);
    }
}
