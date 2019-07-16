package com.yonye.serviceImpl;

import com.yonye.service.AnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {

    @Override
    public void addUser() {
        System.out.println("开始添加用户。。。");
    }
}
