package com.lhb.spring.annotation_web.dao.impl;

import com.lhb.spring.annotation_web.dao.AnnotationRepository;
import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Annotation;

/**
 * Created By LHB on 2019/7/16;
 */
@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository{
    public void addUser() {
        System.out.println("添加用户成功！");
    }

}
