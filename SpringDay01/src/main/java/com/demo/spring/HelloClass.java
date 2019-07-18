package com.demo.spring;

public class HelloClass {
    private String info;
private Student student;

    public String getInfo() {

        return student.getName()+student.getSex();
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void prin(){
    System.out.println(info);
}

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
