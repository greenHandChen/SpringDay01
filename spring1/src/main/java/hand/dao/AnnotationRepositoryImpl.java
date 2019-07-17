package hand.dao;

import hand.service.AnnotationRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("annotationServiceImpl")
public class AnnotationRepositoryImpl {
    @Resource
    @Qualifier("annotationRepository")
    private AnnotationRepository annotationRepository;

    public void addUser(){
        System.out.println("添加用户成功");
    }
}
