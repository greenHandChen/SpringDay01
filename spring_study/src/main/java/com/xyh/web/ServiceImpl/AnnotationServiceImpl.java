package com.xyh.web.ServiceImpl;

import com.xyh.web.Repository.AnnotationRepository;
import com.xyh.web.Service.AnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationService")
public class AnnotationServiceImpl implements AnnotationService {

    @Autowired
    @Qualifier("annotationRepository")
    private AnnotationRepository annotationRepository;

    public void addUser(){
        System.out.println("service层");
        annotationRepository.addUser();
    }

}
