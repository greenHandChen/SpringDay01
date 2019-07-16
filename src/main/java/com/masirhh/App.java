package com.masirhh;

import com.masirhh.beans.addressBean;
import com.masirhh.beans.studentBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("settings.xml");
        addressBean stu=applicationContext.getBean(addressBean.class);
        stu.outaddress();

    }
}
