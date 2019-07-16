package club.osai.spring03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: AnnotationController.java
 * Version: 1.0
 * Date: 2019/7/16
 * Description:
 */
@Controller("annotationController")
public class AnnotationController {
    @Qualifier("annotationService")
    private final AnnotationService annotationService;

    @Autowired
    public AnnotationController(AnnotationService annotationService) {
        this.annotationService = annotationService;
    }

    public void add() {
        annotationService.addUser();

    }
}
