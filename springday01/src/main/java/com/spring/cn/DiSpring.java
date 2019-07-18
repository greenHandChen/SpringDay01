package com.spring.cn;

public class DiSpring {
    private String str;
    public void setDI(String str){
        this.str= str;
    }
    public String getDI(){
        return str;
    }

    @Override
    public String toString() {
        return "DI{" +
                "str='" + str + '\'' +
                '}';
    }
}
