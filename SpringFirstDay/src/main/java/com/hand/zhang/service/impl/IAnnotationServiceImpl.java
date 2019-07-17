package com.hand.zhang.service.impl;

import com.hand.zhang.dao.IAnnotationRepository;
import com.hand.zhang.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * ClassName:IAnnotationServiceImpl
 * Author:ZhangChunjia
 * Date:2019/7/16 19:10
 */
@Service("annotationServiceImpl")
public class IAnnotationServiceImpl implements IAnnotationService {

    @Autowired
    @Qualifier("annotationRepository")
    private IAnnotationRepository iAnnotationRepository;


    @Override
    public void addPerson() {
        iAnnotationRepository.addPerson();
    }
}
