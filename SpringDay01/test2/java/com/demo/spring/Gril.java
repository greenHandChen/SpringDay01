package com.demo.spring;

public class Gril {
    private int weight;
    private int age;
    private String boyfriendName;
    public Gril(int weight,int age,String boyfriendName){
        super();
        this.age=age;
        this.boyfriendName=boyfriendName;
        this.weight=weight;
    }
    public String toString(){
        return "gril{"+"weight="+weight+"age="+age+"boyfriendName="+boyfriendName;
    }
}
