package com.ceh.spring.g_javaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
@Configuration
public class BeanConfiguration {

    @Scope
    @Bean("personP")
    public Person getPerson(@Autowired Student student) {
        Person person = new Person();
        person.setName("安徽工信");
        student.setCode("12761");
        person.setStudent(student);
        return person;
    }



}
