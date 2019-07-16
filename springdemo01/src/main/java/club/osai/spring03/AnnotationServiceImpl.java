package club.osai.spring03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: AnnotationServiceImpl.java
 * Version: 1.0
 * Date: 2019/7/16
 * Description:
 */

@Service("annotationService")
public class AnnotationServiceImpl implements AnnotationService {
    private final AnnotationRepository annotationRepository;

    @Autowired
    public AnnotationServiceImpl(AnnotationRepository annotationRepository) {
        this.annotationRepository = annotationRepository;
    }


    @Override
    public void addUser() {
        annotationRepository.addUser();

    }
}
