package com.hgh.spring.ioc.dao.impl;

import com.hgh.spring.ioc.dao.AnnotationDao;
import org.springframework.stereotype.Repository;

@Repository("annotationDao")
public class AnnotationDaoImpl implements AnnotationDao {
    public void addUser(){
        System.out.println("添加用户成功");
    }
}
