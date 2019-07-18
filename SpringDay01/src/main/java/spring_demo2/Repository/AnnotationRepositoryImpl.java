package spring_demo2.Repository;

import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {
    @Override
    public void addUser() {
        System.out.println("添加用户成功");
    }
}
