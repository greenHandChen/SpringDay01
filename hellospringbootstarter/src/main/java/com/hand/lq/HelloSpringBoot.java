package com.hand.lq;

public class HelloSpringBoot {
    private String words;

    private String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String sayHello() {
        return "hello " + words;
    }
}
