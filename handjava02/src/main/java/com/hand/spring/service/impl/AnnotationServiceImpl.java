package com.hand.spring.service.impl;

import com.hand.spring.bean.IAnnotationRepository;
import com.hand.spring.service.IAnnotationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/16 18:38
 */
@Service("anntationServiceImpl")
public class AnnotationServiceImpl implements IAnnotationService {
    @Autowired
    @Qualifier("annotationRepositoryImpl")
    private IAnnotationRepository annotationRepository;
    @Test
    public void addUser() {
        System.out.println("开始添加用户!");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        annotationRepository = (IAnnotationRepository) applicationContext.getBean("annotationRepositoryImpl");
        annotationRepository.addUser();
    }
}
