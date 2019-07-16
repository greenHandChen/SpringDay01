package com.hand.spring.hello;

import org.springframework.stereotype.Component;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/16 16:22
 */
@Component
public class DISpring {
    private String DIString;

    public String getDIString() {
        return DIString;
    }

    public void setDIString(String DIString) {
        this.DIString = DIString;
    }
}
