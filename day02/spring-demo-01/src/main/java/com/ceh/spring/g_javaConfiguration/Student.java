package com.ceh.spring.g_javaConfiguration;

import org.springframework.stereotype.Component;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
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
