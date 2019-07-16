package f_annotation.web.repository;

import org.springframework.stereotype.Repository;

@Repository(value = "annotationRepository")
public class AnnotationRepositoryImpl implements IAnnotationRepository {
    public void addUser() {
        System.out.println("repository1:添加用户成功");
    }
}
