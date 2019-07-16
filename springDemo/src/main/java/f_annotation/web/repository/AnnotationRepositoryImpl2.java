package f_annotation.web.repository;

import org.springframework.stereotype.Repository;

@Repository(value = "annotationRepository2")
public class AnnotationRepositoryImpl2 implements IAnnotationRepository {
    public void addUser() {
        System.out.println("repository2:添加用户成功");
    }
}
