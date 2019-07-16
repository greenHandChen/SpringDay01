package service.impl;

import dao.AnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.IAnnotationService;

/**
 * Created by zq on 2019/7/16
 */
@Service("annotationServiceImpl")
public class AnnotationServiceImpl implements IAnnotationService {
    @Autowired
    @Qualifier("annotationRepository")
    private AnnotationRepository annotationRepository;

    @Override
    public void addUser() {
        System.out.println("开始添加用户。。。");
        annotationRepository.addUser();
    }
}
