package com.lx.springtest.Controller;

import com.lx.springtest.Service.IAnnotationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController {

    /**
     * Autowired
     * 根据bean的类型加载bean
     */
    @Autowired
    private IAnnotationService annotationService;

    public void say(){
        annotationService.addUser();
    }
}
