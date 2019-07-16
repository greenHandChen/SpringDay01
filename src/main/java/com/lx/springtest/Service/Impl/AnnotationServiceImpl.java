package com.lx.springtest.Service.Impl;

import com.lx.springtest.Dao.IAnnotationRepository;
import com.lx.springtest.Service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnnotationServiceImpl implements IAnnotationService {
    /**
     * Autowired和Qualifier组合注解
     * 根据bean的名称加载bean
     * 相当于Resource注解
     * @Resource(name = "annotationRepository")
     */
    @Autowired
    @Qualifier("annotationRepository")
    private IAnnotationRepository annotationRepository;


    public void addUser() {
        System.out.println("hello,everyone");
        annotationRepository.addUser();
    }
}
