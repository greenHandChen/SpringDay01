package com.annotation.cn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnnotationServiceImpl implements AnnotationService{
    @Autowired
    @Qualifier("annotationDao")
    private  AnnotationDao annotationDao;
    public void addUser(){
        System.out.println("开始添加用户");
        annotationDao.addUser();
    }
}
