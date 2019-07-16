package e_inject.collection;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Arrays;

public class TestCollection {
    @Test
    public void test(){
//        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDemo\\src\\main\\java\\d_lifecycle\\applicationContext.xml");
        AbstractApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDemo\\src\\main\\java\\e_inject\\collection\\applicationContext.xml");
        CollectionBean collectionBean= (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println("list集合："+collectionBean.getList());
        System.out.println("数组："+ Arrays.toString(collectionBean.getArray()));
        //set顺序和applicationContext中配置的set集合顺序一样，采用的是LinkedHashSet
        System.out.println("set集合:"+collectionBean.getSet());
        System.out.println(collectionBean.getSet().getClass());
        //map顺序和applicationContext中配置的map集合顺序是一样的,采用的是LinkedHashMap
        System.out.println("map集合:"+collectionBean.getMap());
        System.out.println(collectionBean.getMap().getClass());
    }
}
