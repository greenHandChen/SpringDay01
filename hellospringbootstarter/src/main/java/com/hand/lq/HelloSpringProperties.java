package com.hand.lq;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "lq")
public class HelloSpringProperties {
    public static final String DEFAULT_WORDS = "world";

    private String words = DEFAULT_WORDS;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}