package com.yonye.serviceImpl;

import com.yonye.service.AnnotationRepository;
import com.yonye.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationService")
public class AnnotationServiceImpl implements IAnnotationService {




    private AnnotationRepository annotationRepository;


    @Override
    public void addUser() {
        System.out.println("开始添加用户。。。");
        annotationRepository.addUser();
    }
}
