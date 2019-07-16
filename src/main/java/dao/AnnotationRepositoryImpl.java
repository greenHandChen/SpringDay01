package dao;

import org.springframework.stereotype.Repository;

@Repository("uDAO")
public class AnnotationRepositoryImpl implements AnnotationRepository {


    public void adduUser() {
        System.out.println("添加用户成功");
    }
}
