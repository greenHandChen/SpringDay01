package com.demo.service;

import com.demo.dao.AnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnnotationServiceImpl implements  AnnotationService{

@Autowired
    @Qualifier("annotationRepository")
    private AnnotationRepository annotationRepository;
public void addUser(){
    annotationRepository.addUser();
}
}
