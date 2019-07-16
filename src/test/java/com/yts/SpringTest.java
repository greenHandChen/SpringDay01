package com.yts;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class SpringTest {

    ApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void getInfo() {
        HelloString helloString;
        helloString = new HelloString();
        helloString.setInfo("芜湖");
        assertEquals("测试", "芜湖", helloString.getInfo());
    }

    @Test
    public void springxml() {
        HelloString helloString = (HelloString) applicationContext.getBean("helloSpring");
        helloString.setInfo("芜湖");
        assertEquals("测试", "芜湖", helloString.getInfo());
    }

    @Test
    public void controller() {
        AnnotationController annotationController = (AnnotationController) applicationContext.getBean("annotationController");
        annotationController.addUser();
    }

    @Test
    public void collection() {
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collection");
        String[] array = collectionBean.getArray();
        assertEquals("", new String[]{"老王", "老李", "老陈"}, array);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("第一排");
        strings.add("第二排");
        strings.add("第三排");

        assertEquals("", strings, collectionBean.getList());

        Set<String> stringSet = new HashSet<>();
        stringSet.add("北京");
        stringSet.add("上海");
        stringSet.add("广州");
        stringSet.add("深圳");

        assertEquals("", stringSet, collectionBean.getSet());

        Map<String, String> map = new HashMap<>();
        map.put("篮球", "kebi");
        map.put("足球", "yuewei");

        assertEquals("", map, collectionBean.getMap());
    }


}
