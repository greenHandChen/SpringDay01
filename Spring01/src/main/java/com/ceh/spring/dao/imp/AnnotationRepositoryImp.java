package com.ceh.spring.dao.imp;

import com.ceh.spring.dao.IAnnotationRepository;
import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositoryImp implements IAnnotationRepository {
    public void addUser() {
        System.out.println("添加用户成功");
    }
}
