package com.ceh.spring.e_inject.constructor;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
public class Person {
    private String name;
    private Integer age;
    private String address;

    public Person() {
        super();
    }

    public Person(String name, Integer age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
