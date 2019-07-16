package com.masirhh;

import com.masirhh.beans.addressBean;
import com.masirhh.beans.studentBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("settings.xml");
        addressBean add1=applicationContext.getBean(addressBean.class);
        addressBean add2=applicationContext.getBean(addressBean.class);

        add1.setId(1);
        add2.setId(2);
        System.out.println(add1.toString());
        System.out.println(add2.toString());

        applicationContext.close();

    }
}
