package dao.impl;

import dao.AnnotationRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zq on 2019/7/16
 */
@Repository("AnnotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {

    @Override
    public void addUser() {
        System.out.println("添加用户成功！");
    }
}
