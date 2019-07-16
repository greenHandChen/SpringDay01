package com.hand;

public class DISpring {
    private String str;

    public void setDISpring(String str) {
        this.str=str;
    }
    public String getDISpring(){
        return str;
    }

    @Override
    public String toString() {
        return "DISpring{" +
                "str='" + str + '\'' +
                '}';
    }
}
