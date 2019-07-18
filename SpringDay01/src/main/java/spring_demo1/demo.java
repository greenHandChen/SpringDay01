package spring_demo1;

import entity.CollectionBean;
import entity.HelloSpring;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class demo {

    @Test
    public void before(){
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setInfo("xxxx");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void now(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("helloSpring.xml");
//        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
//        System.out.println(helloSpring.getInfo());

//        Person person = (Person) applicationContext.getBean("person");
//        System.out.println(person.toString());

        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        String[] array_info = collectionBean.getArray();
        List<String> list_info = collectionBean.getList();
        Set<String> set_info = collectionBean.getSet();
        Map map_info = collectionBean.getMap();

        for (int i=0;i<array_info.length;++i){
            System.out.println("array: " + array_info[i]);
        }

        for (int i=0;i<list_info.size();++i){
            System.out.println("list:" + list_info.get(i));
        }

        List<String> set_list = new ArrayList<>(set_info);
        for (int i=0;i<set_list.size();++i){
            System.out.println("set: " + set_list.get(i));
        }

        System.out.println("map: " + map_info.get("篮球"));
        System.out.println("map: " + map_info.get("足球"));
    }
}
