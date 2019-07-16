package com.zt.spring.g_javaConfiguration;


public class SpringInfo {
    private String info;
    private Student student;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "SpringInfo2{" +
                "info='" + info + '\'' +
                ", student=" + student +
                '}';
    }
}
