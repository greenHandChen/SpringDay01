package com.hand.po;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class AnnotationService implements IAnnotationService {
    @Autowired
    @Qualifier("annotationResponstory")
    private IAnnotationResponstory annotationResponstory;
    public void add(){
        System.out.println("service开始添加");
        annotationResponstory.add();
    }
}
