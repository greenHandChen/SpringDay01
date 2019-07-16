package ServiceImpl;

import Repository.AnnotationRepository;
import Service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements IAnnotationService {
    @Autowired
    @Qualifier("annotationRepository")
    private AnnotationRepository annotationRepository;
    @Override
    public void addUser() {
        System.out.println("Service层：开始加载用户");
        annotationRepository.addUser();
    }
}
