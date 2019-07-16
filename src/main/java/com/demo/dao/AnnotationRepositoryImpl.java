package com.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AnnotationRepositoryImpl implements AnnotationRepository{
    public void addUser(){
        System.out.println("添加用户成功");
    }
}
