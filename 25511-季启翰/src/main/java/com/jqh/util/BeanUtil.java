package com.jqh.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: 几米
 * @Date: 2019/7/17 09:04
 * @Description: BeanUtil
 */
public class BeanUtil<T> {
    static ApplicationContext applicationContext;

    static {
        applicationContext = new ClassPathXmlApplicationContext("application.xml");
    }

    public static <T> T getBean(Class<T> T) {
        return  applicationContext.getBean(T);
    }

}
