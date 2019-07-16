package com.ll.spring.f_annotation.web.repository;

import org.springframework.stereotype.Repository;

@Repository("iannotationrepositoryimpl")
public class IAnnotationRepositoryImpl implements IAnnotationRepository {
    @Override
    public void addUser() {
        System.out.println("添加用户成功！！！");
    }
}
