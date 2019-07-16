package com.ll.spring.f_annotation.java;

import com.ll.spring.f_annotation.lifeCycle.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfigeration {

    @Scope
    @Bean("person")
    public Person getPerson(){
        Person person = new Person();
        person.setAddress("New York");
        person.setAge(19);
        person.setName("Alice");
        return person;
    }
}
