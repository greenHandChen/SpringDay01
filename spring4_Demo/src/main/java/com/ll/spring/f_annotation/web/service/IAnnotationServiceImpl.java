package com.ll.spring.f_annotation.web.service;

import com.ll.spring.f_annotation.web.repository.IAnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class IAnnotationServiceImpl implements IAnnotationService{

    @Autowired
    @Qualifier("iannotationrepositoryimpl")
    private IAnnotationRepository annotationRepository;

    @Override
    public void addUser() {
        System.out.println("用户信息准备完毕！");
        annotationRepository.addUser();
    }
}
