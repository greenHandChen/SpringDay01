package com.jqh.Dao.DaoImpl;

import com.jqh.Dao.AnnotationRepository;
import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {
    public void addUser() {
        System.out.println("添加用户成功!");
    }
}
