package com.hand.spring.controller;

import com.hand.spring.service.IAnnotationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/16 18:35
 */
@Controller
public class AnotationController {

    private IAnnotationService annotationService;
    @Autowired
    public void setAnnotationService(IAnnotationService annotationService) {
        this.annotationService = annotationService;
    }

    @Test
    public void addUser()
    {
        System.out.println("准备开始添加用户");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        annotationService = (IAnnotationService) applicationContext.getBean("anntationServiceImpl");
        annotationService.addUser();
    }
}
