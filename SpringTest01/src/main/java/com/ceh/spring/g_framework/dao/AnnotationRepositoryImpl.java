package com.ceh.spring.g_framework.dao;

import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {
    public void addUser(){
        System.out.println("add success use AnnotationRepositoryImpl");
    }
}
