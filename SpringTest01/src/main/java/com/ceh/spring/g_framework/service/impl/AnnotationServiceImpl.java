package com.ceh.spring.g_framework.service.impl;

import com.ceh.spring.g_framework.dao.AnnotationRepository;
import com.ceh.spring.g_framework.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements IAnnotationService {
    @Autowired
    @Qualifier("annotationRepository")
    private AnnotationRepository annotationRepository;

    @Override
    public void addUser() {
        System.out.println("addUser");
        annotationRepository.addUser();
    }
}
