package com.hgh.spring.ioc.service.impl;

import com.hgh.spring.ioc.dao.AnnotationDao;
import com.hgh.spring.ioc.service.AnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements AnnotationService {
    @Autowired
    @Qualifier("annotationDao")
    private AnnotationDao annotationDao;

    public void addUser() {
        System.out.println("开始添加用户");
        annotationDao.addUser();
    }
}
