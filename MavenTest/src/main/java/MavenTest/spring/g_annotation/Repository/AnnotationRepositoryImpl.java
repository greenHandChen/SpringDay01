package MavenTest.spring.g_annotation.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository{

    public void addUser() {
        System.out.println("添加用户成功！");
    }
}
