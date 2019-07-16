package com.hand.bean;

import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Map;

@Scope("prototype")
@Component("myStudent")
public class Student {
    //学生ID
    @Value("1")
    private Integer stu_id;
    //学生姓名
    @Value("小黄")
    private String stu_name;
    //老师
    @Autowired
    @Qualifier("myTeacher")
    private Teacher myTeacher;

    public Student() {
        System.out.println("---------------------------------------");
        System.out.println("调用无参构造函数初始化Student对象..");
    }

    public Student(Integer stu_id, String stu_name, Teacher myTeacher) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.myTeacher = myTeacher;
    }

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public Teacher getMyTeacher() {
        return myTeacher;
    }

    public void setMyTeacher(Teacher myTeacher) {
        this.myTeacher = myTeacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", myTeacher=" + myTeacher +
                '}';
    }

    public String toSuperString() {
        return super.toString();
    }

    //调用构造函数初始化对象后执行
    public void init() {
        System.out.println("--------------------------------");
        System.out.println("Student对象初始化执行..");
    }

    //scope为singleton时，context.close()才会执行
    @After
    public void destroy() {
        System.out.println("--------------------------------");
        System.out.println("Student对象销毁..");
    }

    public void execution(){
        System.out.println("--------------------------------");
        System.out.println("执行方法...");
    }
}
