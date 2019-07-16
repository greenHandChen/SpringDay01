package com.hand.dao.impl;

import com.hand.dao.IStudentDao;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao implements IStudentDao {
    public int insertStudent() {
        System.out.println("-----------------------------------");
        System.out.println("dao：添加学生成功！");
        return 1;
    }
}
