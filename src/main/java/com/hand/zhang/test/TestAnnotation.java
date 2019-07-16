package com.hand.zhang.test;

import com.hand.zhang.controller.IAnnotationController;
import com.hand.zhang.dao.IAnnotationRepository;
import com.hand.zhang.service.IAnnotationService;
import com.hand.zhang.service.impl.IAnnotationServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestAnnotation
 * Author:ZhangChunjia
 * Date:2019/7/16 19:16
 */

public class TestAnnotation {


    @Test
    public void test01(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("conf/spring-beans.xml");
        IAnnotationController iAnnotationController=new IAnnotationController();
        iAnnotationController.addUser();
    }
}
