package com.zt.spring.f_annotation.web.repository;

import org.springframework.stereotype.Repository;

@Repository("annotationRepositoryImpl")
public class AnnotationRepositoryImpl implements IAnnotationRepository {
    public void addUser() {
        System.out.println("添加用户成功！");
    }
}
