package com.annotation.cn;

import org.springframework.stereotype.Repository;

@Repository("annotationDao")
public class AnnotationDaoImpl implements AnnotationDao{
    public void addUser(){
        System.out.println("添加用户成功！");
    };
}
