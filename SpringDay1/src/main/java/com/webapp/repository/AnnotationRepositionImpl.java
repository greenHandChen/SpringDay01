package com.webapp.repository;

import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositionImpl implements IAnnotationRepository {


    public void addUser(){
        System.out.println("添加用户成功");
    }
}
