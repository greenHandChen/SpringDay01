package com.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.webapp.repository.IAnnotationRepository;

@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements IAnnotationService{
    @Autowired
    @Qualifier("annotationRepository")
    private IAnnotationRepository annotationRepository;

    public void  addUser(){
        System.out.println("开始添加用户");
        annotationRepository.addUser();
    }

}

