package com.lx.springtest.Dao.Impl;

import com.lx.springtest.Dao.IAnnotationRepository;
import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements IAnnotationRepository {

    public void addUser() {
        System.out.println("dao实现类");
    }
}
