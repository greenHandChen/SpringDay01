package com.ceh.spring.f_annotation.web.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements IAnnotationRepository {
    public void addUser() {
        System.out.println("添加用户成功！");
    }
}
