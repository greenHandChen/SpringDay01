package com.masirhh;

import com.masirhh.beans.studentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App1 {
  //  public static void main(String[] args) {
//        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("settings.xml");
//        studentBean stu=applicationContext.getBean("studentBean1",studentBean.class);
//        System.out.println(stu.toString());
//    }


    @Autowired
    @Qualifier("studentBean1")
    private static studentBean studentBean1;

}
