package com.xyh.web.RepositoryImpl;

import com.xyh.web.Repository.AnnotationRepository;
import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {

    public void addUser() {
        System.out.println("成功添加用户信息");
    }
}
