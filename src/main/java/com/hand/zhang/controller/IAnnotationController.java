package com.hand.zhang.controller;

import com.hand.zhang.service.IAnnotationService;
import com.hand.zhang.service.impl.IAnnotationServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName:IAnnotationController
 * Author:ZhangChunjia
 * Date:2019/7/16 19:32
 */
@Controller
public class IAnnotationController {

    private IAnnotationService annotationService;

    @Autowired
    public void setAnnotationService(IAnnotationService iAnnotationService){
        this.annotationService=iAnnotationService;
    }

    public void addUser(){
        System.out.println("准备开始添加用户");
        annotationService.addPerson();
    }

}
