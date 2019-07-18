package spring_demo2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring_demo2.Repository.AnnotationRepository;

@Service("annotationServiceImpl")
public class IAnnotationServiceImpl implements IAnnotationService {

    @Autowired
    @Qualifier("annotationRepository")
    private AnnotationRepository annotationRepository;

    @Override
    public void addUser() {
        System.out.println("开始添加用户...");
        annotationRepository.addUser();
    }
}
