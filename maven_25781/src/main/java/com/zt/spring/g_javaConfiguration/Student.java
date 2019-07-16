package com.zt.spring.g_javaConfiguration;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String code;

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
