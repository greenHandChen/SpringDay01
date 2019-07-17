package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class testColletion {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collection/Beans.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collection");
        Arrays.stream(collectionBean.getArray()).forEach(System.out::print);
        System.out.println();
        System.out.println(collectionBean.getList());
        System.out.println(collectionBean.getSet());
        System.out.println(collectionBean.getMap());
    }
}
