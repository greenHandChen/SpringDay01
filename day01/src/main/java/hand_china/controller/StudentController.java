package hand_china.controller;

import hand_china.beans.Student;
import hand_china.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student add(String name,Integer age){
        Student s = studentService.add(name, age);
        return s;
    }

}
