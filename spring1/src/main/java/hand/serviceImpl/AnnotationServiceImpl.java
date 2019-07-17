package hand.serviceImpl;

import hand.service.IAnnotationService;
import org.springframework.stereotype.Service;

@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements IAnnotationService {


    public void addUser() {
        System.out.println("添加用户");
    }
}
