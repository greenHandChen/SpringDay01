package com.lx.helloworld;

public class PersonService {

    private PersonProperties properties;

    public PersonService(PersonProperties properties) {
        this.properties = properties;
    }

    public PersonService(){

    }

    public String sayHello(){
        return "hello springBoot";
    }
}
