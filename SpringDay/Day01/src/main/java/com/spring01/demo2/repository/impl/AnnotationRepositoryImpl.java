package com.spring01.demo2.repository.impl;

import com.spring01.demo2.repository.AnnotationRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wangjie_fourth on 2019/7/16.
 */
@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {
    @Override
    public void addUser() {
        System.out.println("添加用户成功！");
    }
}
