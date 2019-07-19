package com.hand.bean;

public class BeanFactory {

    //动态工厂bean
    public Student getStudent(){
        Student student = new Student();
        student.setStu_id(12);
        return student;
    }

    //静态工厂bean
    public static Student getStudent2(){
        Student student = new Student();
        student.setStu_id(33);
        return student;
    }
}
