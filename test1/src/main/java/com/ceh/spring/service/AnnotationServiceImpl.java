package com.ceh.spring.service;

import com.ceh.spring.b_di.IAnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by HuangHeng on 2019/7/16
 */
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
