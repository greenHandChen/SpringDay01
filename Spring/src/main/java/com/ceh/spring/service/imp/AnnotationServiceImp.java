package com.ceh.spring.service.imp;

import com.ceh.spring.dao.IAnnotationRepository;
import com.ceh.spring.dao.imp.AnnotationRepositoryImp;
import com.ceh.spring.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationService")
public class AnnotationServiceImp implements IAnnotationService {
    @Autowired
    @Qualifier("annotationRepository")
    private IAnnotationRepository annotationRepository;

    public void addUser() {
        System.out.println("开始添加用户...");
        annotationRepository.addUser();
    }
}
