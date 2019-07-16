package f_annotation.web.service;

import f_annotation.web.repository.IAnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "annotationServiceImpl")
public class AnnotationServiceImpl implements IAnnotationService {
    @Autowired
    @Qualifier(value = "annotationRepository")
    private IAnnotationRepository annotationRepository;
    public void addUser() {
        System.out.println("serviceImpl:开始添加用户");
        annotationRepository.addUser();
    }
}
