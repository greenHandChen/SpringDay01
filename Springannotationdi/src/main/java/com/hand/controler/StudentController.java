package com.hand.controler;

import com.hand.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    private IStudentService stuService;
    @Autowired
    public void setStuService(IStudentService stuService) {
        this.stuService = stuService;
    }

    public void addStudent(){
        System.out.println("-----------------------------------");
        System.out.println("controller：准备添加学生...");
        stuService.addStudent();
    }
}
