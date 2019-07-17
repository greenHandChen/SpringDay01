import org.springframework.stereotype.Repository;

@Repository("annotationRepository")
public class AnnotationRepositoryImpl implements AnnotationRepository {
    public void addUser(){
        System.out.println("添加用户成功！");
    }
}
