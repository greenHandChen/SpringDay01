package com.hand.bean;

public class Student {
    //
    private Integer stu_id;
    //
    private String stu_name;

    private Teacher myTeacher;

    public Student() {
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
}
