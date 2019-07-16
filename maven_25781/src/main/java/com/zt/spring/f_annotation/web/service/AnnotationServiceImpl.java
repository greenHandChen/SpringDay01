package com.zt.spring.f_annotation.web.service;

import com.zt.spring.f_annotation.web.repository.IAnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AnnotationServiceImpl implements IAnnotationService{

    //@Resource(name = "annotationRepositoryImpl")
    @Autowired
    @Qualifier("annotationRepositoryImpl")
    private IAnnotationRepository iAnnotationRepository;

    public void addUser() {
        System.out.println("用户信息填充完毕！");
        iAnnotationRepository.addUser();
    }
}
