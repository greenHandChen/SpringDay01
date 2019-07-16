package service.impl;

import dao.AnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.IAnnotationService;

import javax.annotation.Resource;

@Service
public class IAnnotationServiceImpl implements IAnnotationService {

//    @Autowired
//    @Qualifier("annotationRepository")
    @Resource(name="uDAO")
    private AnnotationRepository annotationRepository;

    public void add() {
        System.out.println("This is the Service add...");

    }
}
