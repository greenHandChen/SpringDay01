package com.frank.spring.demo04;

import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {
    @Override
    public void addUser() {
        System.out.println("用户添加成功");
    }
}
