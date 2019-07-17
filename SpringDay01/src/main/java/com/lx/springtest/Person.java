package com.lx.springtest;

public class Person {
    private String name;
    private Integer age;
    private String address;

    public Person(String name, Integer age, String address) {
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

    private void initBean(){
        System.out.println("Person初始化");
    }

    private void destory(){
        System.out.println("Person销毁");
    }
}
