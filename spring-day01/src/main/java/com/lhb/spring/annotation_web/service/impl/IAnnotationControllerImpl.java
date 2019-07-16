package com.lhb.spring.annotation_web.service.impl;

import com.lhb.spring.annotation_web.dao.impl.AnnotationRepositoryImpl;
import com.lhb.spring.annotation_web.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created By LHB on 2019/7/16;
 */

@Service("annotationServiceImpl")
public class IAnnotationControllerImpl implements IAnnotationService {

    @Autowired
    @Qualifier("annotationRepository")
    private AnnotationRepositoryImpl annotationRepository;

    public void addUser() {
        System.out.println("开始添加用户...");
        annotationRepository.addUser();
    }
}
