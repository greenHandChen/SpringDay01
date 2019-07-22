package com.ceh.spring.f_annotation.web.service;

import com.ceh.spring.f_annotation.web.repository.IAnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
@Service
public class AnnotationServiceImpl implements IAnnotationService {
    @Autowired
    @Qualifier("annotationRepository")
    private IAnnotationRepository annotationRepository;

    public void addUser() {
        System.out.println("用户信息填充完毕!");
        annotationRepository.addUser();
    }
}
