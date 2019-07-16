package com.hand.service.impl;

import com.hand.dao.IStudentDao;
import com.hand.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("stuService")
public class StudentService implements IStudentService {
    @Autowired
    private IStudentDao stuDao;
    public int addStudent() {
        System.out.println("-----------------------------------");
        System.out.println("servier：执行添加学生...");
        return stuDao.insertStudent();
    }
}
