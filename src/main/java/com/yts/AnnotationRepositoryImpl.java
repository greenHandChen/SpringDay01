package com.yts;

import org.springframework.stereotype.Repository;

@Repository("annotationrepository")
public class AnnotationRepositoryImpl implements IAnnotationRepository {
    @Override
    public void addUser() {
        System.out.println("添加用户成功");
    }
}
