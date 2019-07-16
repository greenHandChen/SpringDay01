package RepositoryImpl;

import Repository.AnnotationRepository;
import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {
    @Override
    public void addUser() {
        System.out.println("Dao层：添加用户成功。");
    }
}
