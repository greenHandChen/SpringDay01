package com.jqh.Service.ServiceImpl;

import com.jqh.Dao.AnnotationRepository;
import com.jqh.Service.AnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements AnnotationService {

    @Autowired
    @Qualifier("annotationRepository")
    AnnotationRepository annotationRepository;

    public void addUser() {

        annotationRepository.addUser();
    }
}
