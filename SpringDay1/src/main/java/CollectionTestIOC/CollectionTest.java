package CollectionTestIOC;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollectionTest {
    @Test
    public void run() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IDEA\\workspace\\SpringDay1\\src\\main\\resources\\applicationXML\\applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean.getList());
        String[] array = collectionBean.getArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println(collectionBean.getMap());
        System.out.println(collectionBean.getSet());
    }
}
