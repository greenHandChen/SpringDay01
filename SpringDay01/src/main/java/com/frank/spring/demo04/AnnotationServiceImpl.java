package com.frank.spring.demo04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationService")
public class AnnotationServiceImpl implements IAnnotationService {
   @Autowired
   @Qualifier("annotationRepository")
    private AnnotationRepository annotationRepository;
    @Override
    public void addUser() {
        System.out.println("开始添加用户..");
        annotationRepository.addUser();
    }
}
