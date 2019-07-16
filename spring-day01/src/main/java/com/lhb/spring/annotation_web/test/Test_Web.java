package com.lhb.spring.annotation_web.test;

import com.lhb.spring.annotation_web.controller.AnnotationController;
import com.lhb.spring.annotation_web.dao.AnnotationRepository;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By LHB on 2019/7/16;
 */
public class Test_Web {

    @Test
    public void TestUser() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring.ioc/applicationContext.xml");
//        AnnotationRepository annotationRepository = (AnnotationRepository) applicationContext.getBean("annotationRepository");
        AnnotationController controller = (AnnotationController) applicationContext.getBean("annotationController");
        controller.addUser();
    }

}
