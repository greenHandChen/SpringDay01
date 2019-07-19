package com.ll.spring.f_annotation.std;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfigeration {

    @Scope
    @Bean("personP")
    public Person getPerson(@Autowired Student student){
        Person person = new Person();
        person.setAddress("New York");
        person.setAge(19);
        person.setName("Alice");
        student.setCode("12344444");
        person.setStudent(student);
        return person;
    }
}
