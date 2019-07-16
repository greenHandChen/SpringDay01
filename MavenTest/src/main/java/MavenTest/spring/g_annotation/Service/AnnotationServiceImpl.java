package MavenTest.spring.g_annotation.Service;

import MavenTest.spring.g_annotation.Repository.AnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements IAnnotationService{

    @Autowired
    @Qualifier("annotationRepository")
    private AnnotationRepository annotationRepository;

    public void addUser() {
        System.out.println("开始添加用户...");
        annotationRepository.addUser();
    }
}
