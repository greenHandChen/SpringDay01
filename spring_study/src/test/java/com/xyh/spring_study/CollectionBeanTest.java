package com.xyh.spring_study;

import com.xyh.spring_studay.CollectionBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollectionBeanTest {

    @Test
    public void collection()
    {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\workspace\\spring_study\\src\\main\\java\\com\\xyh\\spring_studay\\beans.xml");
        CollectionBean collectionBean=applicationContext.getBean("collectionBean",CollectionBean.class);


        String[] strings=collectionBean.getArray();
        System.out.print("[");
        for (String s:strings)
            System.out.print(s+",");
        System.out.println("]");
        System.out.println(collectionBean.getList().toString());
        System.out.println(collectionBean.getSet().toString());
        System.out.println(collectionBean.getMap().toString());
    }
}
