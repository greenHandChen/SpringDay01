package hand_china.service;

import hand_china.beans.Student;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService {

    public Student add(String name, Integer age){
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        return s;
    }

}
