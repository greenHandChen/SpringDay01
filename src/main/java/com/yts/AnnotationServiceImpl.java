package com.yts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements IAnnotationService {

    @Autowired
    @Qualifier("annotationrepository")
    private IAnnotationRepository annotationRepository;

    @Override
    public void addUser() {
        System.out.println("开始添加用户");
        annotationRepository.addUser();
    }
}
