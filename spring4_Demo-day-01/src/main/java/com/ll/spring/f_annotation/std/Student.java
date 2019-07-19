package com.ll.spring.f_annotation.std;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String code;

    public Student(String code) {
        this.code = code;
    }

    public Student() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                '}';
    }
}
