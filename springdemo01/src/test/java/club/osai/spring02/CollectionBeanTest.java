package club.osai.spring02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionBeanTest {

    /**
     * xml手动注入
     */
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring02/beans.xml");
        CollectionBean collectionBean = applicationContext.getBean("collectionBean", CollectionBean.class);
    }
}