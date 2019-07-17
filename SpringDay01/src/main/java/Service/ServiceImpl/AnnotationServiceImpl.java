package Service.ServiceImpl;

import Service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements IAnnotationService {

    @Autowired
    @Qualifier("annotationRepository")
    public void addUser() {
        System.out.println("开始添加用户。。。");
        annotationRepository.addUser();
    }
}
