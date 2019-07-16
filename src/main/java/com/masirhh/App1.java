package com.masirhh;

import com.masirhh.beans.studentBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("settings.xml");
        studentBean stu=applicationContext.getBean("studentBean1",studentBean.class);
        System.out.println(stu.toString());
    }
}
